package com.attendancemanager;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;

import com.astuetz.viewpager.extensions.TabsAdapter;
import com.astuetz.viewpager.extensions.ViewPagerTabButton;


public class FixedTabsAdapter implements TabsAdapter {
	
	private Activity mContext;
	
	private String[] mTitles = {
	    "Mon", "Tue", "Wed","Thurs","Fri","Sat","Sun"
	};
	
	public FixedTabsAdapter(Activity ctx) {
		this.mContext = ctx;
	}
	
	@Override
	public View getView(int position) {
		ViewPagerTabButton tab;
		
		LayoutInflater inflater = mContext.getLayoutInflater();
		tab = (ViewPagerTabButton) inflater.inflate(R.layout.tab_fixed, null);
		
		if (position < mTitles.length) tab.setText(mTitles[position]);
		
		return tab;
	}
	
}
