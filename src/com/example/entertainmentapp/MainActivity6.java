package com.example.entertainmentapp;


import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity6 extends ActionBarActivity implements OnClickListener{
	Button btn;
	TextView tv;
	RadioButton rb1,rb2,rb3,rb4;
    Intent i1,i2;
    float a=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity6);
		btn=(Button)findViewById(R.id.button1);
		tv=(TextView)findViewById(R.id.textView1);
		rb1=(RadioButton)findViewById(R.id.radioButton1);
		rb2=(RadioButton)findViewById(R.id.radioButton2);
		rb3=(RadioButton)findViewById(R.id.radioButton3);
		rb4=(RadioButton)findViewById(R.id.radioButton4);
		btn.setOnClickListener(this);
		i1=getIntent();
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		i2=new Intent(MainActivity6.this,MainActivity7.class);
		if(rb4.isChecked())
		{
			a+=1;
		}
		else if(rb1.isChecked())
		{
			a-=0.5;
		}
		else if(rb2.isChecked())
		{
			a-=0.5;
		}
		else if(rb3.isChecked())
		{
			a-=0.5;
		}
		i2.putExtra("K1",a);
		startActivity(i2);
	
	}

	
}
