package com.wifichooser;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;

public class FullscreenActivity extends Activity {

	private static final String TAG = null;

	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    
	    setContentView(R.layout.main);
	    
	      startActivity(new Intent(android.provider.Settings.ACTION_WIFI_SETTINGS));
	      
finish();
	}}