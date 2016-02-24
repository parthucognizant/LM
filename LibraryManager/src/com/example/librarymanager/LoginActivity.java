package com.example.librarymanager;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;

import com.example.librarymanager.util.constants;

public class LoginActivity extends ActionBarActivity {

	private static final String TAG = "LoginActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.i(TAG,constants.logs.loginonCreate);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
	}
}
