package com.example.entertainmentapp;

import android.support.v7.app.ActionBarActivity;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity12 extends ActionBarActivity {
	Intent i;
	String s;
    int a;
    TextView tv;
    EditText edt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity12);
		tv=(TextView)findViewById(R.id.textView1);
		edt=(EditText)findViewById(R.id.editText1);
		i=getIntent();
		s=i.getStringExtra("k1");
		a=Integer.parseInt(s);
		if(a==4)
		{
			edt.setText("Hulk");
		}
		else if(a==5)
		{
			edt.setText("Flash");
		}
		else if(a==6)
		{
			edt.setText("Batman");
		}
		else if(a==7)
		{
			edt.setText("Ironman");
		}
		else if(a==8)
		{
			edt.setText("Superman");
		}
		else if(a==9)
		{
			edt.setText("Spiderman");
		}
		else
		{
			edt.setText("Try again");
		}
	}

	
}
