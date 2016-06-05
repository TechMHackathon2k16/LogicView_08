package com.example.entertainmentapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity1 extends ActionBarActivity implements OnClickListener{
	EditText edt1,edt2,edt3;
	Button btn;
	MyDatabase db;
	SQLiteDatabase sql;
	ContentValues cv;
	Intent in;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity1);
		edt1=(EditText)findViewById(R.id.editText1);
		edt2=(EditText)findViewById(R.id.editText2);
		edt3=(EditText)findViewById(R.id.editText3);
		btn=(Button)findViewById(R.id.button1);
		btn.setOnClickListener(this);
		in=getIntent();
		db=new MyDatabase(MainActivity1.this);
		sql=db.getWritableDatabase();
		cv=new ContentValues();
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		sql.insert("tbl","Plese enter value", cv);
		cv.put("username",edt2.getText().toString());
		cv.put("password",edt3.getText().toString());
		long result = sql.insert("tbl","hfjf",cv);
		if(result>0)
		{
			Toast.makeText(MainActivity1.this,"data saved at  "+result,500).show();
		     
		     edt2.setText("");
		     edt3.setText("");
		}
		else
		{
			Toast.makeText(MainActivity1.this,"some problem occured",500).show();
		}
	}

	
}
