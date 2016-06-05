package com.example.entertainmentapp;

import android.support.v7.app.ActionBarActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;  
import android.widget.Button;

public class MainActivity2 extends ActionBarActivity implements OnClickListener{
   Intent in,in1,in2,in3,in4;
   Button btn1,btn2,btn3;
   TextView tv1,tv2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity2);
		in=getIntent();
		btn1=(Button)findViewById(R.id.button1);
		btn2=(Button)findViewById(R.id.button2);
		btn3=(Button)findViewById(R.id.button3);
		//btn4=(Button)findViewById(R.id.button4);
		tv1=(TextView)findViewById(R.id.textView1);
		tv2=(TextView)findViewById(R.id.textView2);
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		btn3.setOnClickListener(this);
		//btn4.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
			switch(v.getId()){
			case R.id.button1:
				Toast.makeText(MainActivity2.this,"hello",500).show();
				in3=new Intent(MainActivity2.this,MainActivity4.class);
				startActivity(in3);
				Log.e("sdcsdds","here reached");
			    break;
			case R.id.button2:
				in4=new Intent(MainActivity2.this,MainActivity5.class);
				startActivity(in4);
				break;
				
			case R.id.button3:
				in2=new Intent(MainActivity2.this,MainActivity3.class);
				startActivity(in2);
				break;
				
			
			}
		
	}

	
}
