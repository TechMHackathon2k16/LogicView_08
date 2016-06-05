package com.example.entertainmentapp;



import android.support.v7.app.ActionBarActivity;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity11 extends ActionBarActivity {
	EditText edt;
    TextView tv1,tv2;
    Intent i;
    float f;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity11);
		i=getIntent();
		f=i.getFloatExtra("K2",50);
		tv1=(TextView)findViewById(R.id.textView1);
		tv2=(TextView)findViewById(R.id.textView2);
		edt=(EditText)findViewById(R.id.editText1);
		edt.setText("TOTAL="+f);
		if(f<3)
		{
		 tv2.setText("@Try Again@");	
		}
		else if(f==3)
		{
		 tv2.setText("!NICE!");
		}
		else if(3<f&&f<=4)
		{
		 tv2.setText("!!GOOD!!");
		}
		else if(4<f&&f<=5)
		{
		 tv2.setText("!!!!EXCELLENT!!!!");
		}
	}

	

	
}
