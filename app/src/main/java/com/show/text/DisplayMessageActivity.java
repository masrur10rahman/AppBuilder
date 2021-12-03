package com.show.text;

import androidx.appcompat.app.AppCompatActivity;
import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.content.*;
import android.view.View;

public class DisplayMessageActivity extends AppCompatActivity {
	
	
	private String edittext1 = "";
	private String text = "";
	
	private LinearLayout linear1;
	private Button button1;
	private TextView textview1;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.display_message);
	}
}
