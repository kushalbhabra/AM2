package com.attendancemanager;

import com.astuetz.viewpager.extensions.FixedTabsView;
import com.astuetz.viewpager.extensions.IndicatorLineView;
import com.astuetz.viewpager.extensions.ScrollingTabsView;
import com.astuetz.viewpager.extensions.SwipeyTabsView;
import com.astuetz.viewpager.extensions.TabsAdapter;


import android.os.Bundle;
import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;

public class FeedTimetable extends Activity {

	private ViewPager mPager;
	private SwipeyTabsView mSwipeyTabs;
	private FixedTabsView mFixedTabs;
	private IndicatorLineView mLine;
	private ScrollingTabsView mScrollingTabs;
	
	private PagerAdapter mPagerAdapter;
	private TabsAdapter mSwipeyTabsAdapter;
	private TabsAdapter mFixedTabsAdapter;
	private TabsAdapter mScrollingTabsAdapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_feed_timetable);
		setContentView(R.layout.activity_fixed_tabs);
		initViewPager(7, 0xFFFFFFFF, 0xFF000000);
		mFixedTabs = (FixedTabsView) findViewById(R.id.fixed_tabs);
		mFixedTabsAdapter = new FixedTabsAdapter(this);
		mFixedTabs.setAdapter(mFixedTabsAdapter);
		mFixedTabs.setViewPager(mPager);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_feed_timetable, menu);
		return true;
	}
	private void initViewPager(int pageCount, int backgroundColor, int textColor) {
		mPager = (ViewPager) findViewById(R.id.pager);
		mPagerAdapter = new ExamplePagerAdapter(this, pageCount, backgroundColor, textColor);
		mPager.setAdapter(mPagerAdapter);
		mPager.setCurrentItem(1);
		mPager.setPageMargin(1);
	}

}
