package com.sriyanksiddhartha.applytheme;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Author : Sriyank Siddhartha
 * Module 2: Understanding Material Design
 *
 * 		"AFTER" demo project
 */
public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Check if we're running on Android 5.0 or higher
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
			// Call some material design APIs here
		} else { // For Below API 21
			// Implement this feature without material design
		}
	}
}
