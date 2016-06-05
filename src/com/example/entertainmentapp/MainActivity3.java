package com.example.entertainmentapp;

import android.support.v7.app.ActionBarActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;  
import android.widget.Button;

public class MainActivity3 extends ActionBarActivity implements OnClickListener{
     Intent in,in1;
	   Button btn1,btn2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity3);
		in=getIntent();
		btn1=(Button)findViewById(R.id.button1);
		btn2=(Button)findViewById(R.id.button2);
		in1=new Intent(MainActivity3.this,serv.class);
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.button1:
			Toast.makeText(MainActivity3.this,"hello",500).show();
			startService(in1);
			Log.e("sdcsdds","here reached");
		    break;
		case R.id.button2:
			stopService(in1);
			break;
		}
	}

	
}
