package com.example.entertainmentapp;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity4 extends ActionBarActivity implements OnClickListener {
	TextView tv1,tv2,tv3;
	Intent in,in1;
	Button btn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity4);
		in=getIntent();
		btn=(Button)findViewById(R.id.button1);
        tv1=(TextView)findViewById(R.id.textView1);
        tv2=(TextView)findViewById(R.id.textView2);
        tv3=(TextView)findViewById(R.id.textView3);
        btn.setOnClickListener(this);
        
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent i1=new Intent(MainActivity4.this,MainActivity6.class);
		startActivity(i1);
	}

	
}
