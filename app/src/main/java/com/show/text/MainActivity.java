package com.show.text;

import androidx.appcompat.app.AppCompatActivity;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.view.View;

public class MainActivity extends AppCompatActivity {
	
	private String text = "";
	
	private LinearLayout linear1;
	private EditText edittext1;
	private Button button1;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
	}
}
