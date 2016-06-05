package com.example.entertainmentapp;


import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;
public class MainActivity8 extends ActionBarActivity implements OnClickListener{
	Button btn;
	TextView tv;
	RadioButton rb1,rb2,rb3,rb4;
	Intent i1,i2;
	float c;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity8);
		btn=(Button)findViewById(R.id.button1);
		tv=(TextView)findViewById(R.id.textView1);
		rb1=(RadioButton)findViewById(R.id.radio0);
		rb2=(RadioButton)findViewById(R.id.radio1);
		rb3=(RadioButton)findViewById(R.id.radio2);
		rb4=(RadioButton)findViewById(R.id.radioButton1);
		btn.setOnClickListener(this);
		i1=getIntent();
		c=i1.getFloatExtra("K2",50);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		i2=new Intent(MainActivity8.this,MainActivity9.class);
		if(rb4.isChecked())
		{
			c+=1;
		}
		else if(rb1.isChecked())
		{
			c-=0.5;
		}
		else if(rb2.isChecked())
		{
			c-=0.5;
		}
		else if(rb3.isChecked())
		{
			c-=0.5;
		}
		i2.putExtra("K2",c);
		startActivity(i2);
	}

	
}
