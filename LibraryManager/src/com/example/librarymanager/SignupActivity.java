package com.example.librarymanager;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;

import com.example.librarymanager.util.constants;

public class SignupActivity extends ActionBarActivity {

	private static final String TAG = "SignupActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.i(TAG,constants.logs.signuponCreate);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signup);
	}

}
