package com.example.entertainmentapp;


import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity5 extends ActionBarActivity implements OnClickListener{
	Button btn;
	TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7;
	EditText edt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity5);
		 btn=(Button)findViewById(R.id.button1);
	        tv1=(TextView)findViewById(R.id.textView1);
	        tv2=(TextView)findViewById(R.id.textView2);
	        tv3=(TextView)findViewById(R.id.textView3);
	        tv4=(TextView)findViewById(R.id.textView4);
	        tv5=(TextView)findViewById(R.id.textView5);
	        tv6=(TextView)findViewById(R.id.textView6);
	        tv7=(TextView)findViewById(R.id.textView7);
	        edt=(EditText)findViewById(R.id.editText1);
	        btn.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent i=new Intent(MainActivity5.this,MainActivity12.class);
		i.putExtra("k1",edt.getText().toString());
		startActivity(i);
	}

	
}
