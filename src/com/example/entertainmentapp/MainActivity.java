package com.example.entertainmentapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity implements OnClickListener {
	Button btn1,btn2;
	EditText edt1,edt2;
	TextView tv1,tv2;
	MyDatabase db;
	SQLiteDatabase sql;
	ContentValues cv;
	String str1,str2;
	Intent in,in1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn1=(Button)findViewById(R.id.button1);
		btn2=(Button)findViewById(R.id.button2);
		edt1=(EditText)findViewById(R.id.editText1);
		edt2=(EditText)findViewById(R.id.editText2);
		tv1=(TextView)findViewById(R.id.textView1);
		tv2=(TextView)findViewById(R.id.textView2);
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		db=new MyDatabase(MainActivity.this);
		sql=db.getWritableDatabase();
		cv=new ContentValues();
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.button1:
			in=new Intent(MainActivity.this,MainActivity1.class);
			startActivity(in);
			break;
		case R.id.button2:
			sql=db.getReadableDatabase();
			Cursor cursor=sql.rawQuery("select * from tbl",null);
			while (cursor.moveToNext())
			{
				str1 = cursor.getString(cursor.getColumnIndex("username"));
				str2 = cursor.getString(cursor.getColumnIndex("password"));
				//Toast.makeText(MainActivity.this,"hello",500).show();			}
		   }       
			if((str1).equals(edt1.getText().toString())&&(str2).equals(edt2.getText().toString()))
		   {
		     in1=new Intent(MainActivity.this,MainActivity2.class); 
		     startActivity(in1);
		     finish();
		   }
	      else
	      {
		     Toast.makeText(MainActivity.this,"Error",500).show();
	      }break;
	}
	}

	
}
