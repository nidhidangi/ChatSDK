package com.example.tabhost;

import android.app.Activity;
import android.os.Bundle;


public class PhotosActivity extends Activity 
{
	/***********************************************************************
	 * Function Name        : onCreate()
	 * Description          : Invoke to create the Activity
	 * Input parameters     : None
	 * output parameters    : None
	 * return values        : None
	 ***********************************************************************/ 

	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.photos_layout);
	}
}
