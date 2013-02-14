package com.attendancemanager;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class EditTimetable extends Activity implements OnItemClickListener {
	ArrayList<Lecture> lectures = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.edittimetablelist);
		ListView list = (ListView) findViewById(R.id.list_lectures);
		
		Lecture lecture = null;
		lectures = new ArrayList<Lecture>();
		Lecture blank=new Lecture("Select Subject", "Time", "na");
		lectures.add(blank);
		LectureArrayAdapter LAA = new LectureArrayAdapter(this, R.layout.lectureinlist, lectures);
        list.setAdapter(LAA);
        list.setOnItemClickListener(this);
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		Log.d("AM", "LIST ITEM CLICKED AT "+arg2);
		Log.d("AM", arg1.toString());
		Log.d("AM",""+ R.id.tv_subjectname);
		if(arg1.getId()==R.id.tv_subjectname){
			
		}
		if(arg1.getId()==R.id.tv_time){
			Toast.makeText(EditTimetable.this, "Time clicked", 5000).show();
		}
		
	}
}
