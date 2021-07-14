package com.mycompany.HH;

import android.app.*;
import android.content.*;
import android.os.*;
import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.app.*;
import android.view.View.OnClickListener.*;
import android.widget.Button.*;
import android.content.*;
import android.net.*;
import android.app.Activity.*;
import android.media.MediaPlayer.*;
import android.os.Bundle.*;
import android.app.Activity.*;
import android.app.AlertDialog.*;
import android.content.DialogInterface.*;
import android.os.Bundle.*;
import android.view.View.*;
import android.view.View.OnClickListener.*;
import android.widget.Button.*;
import android.webkit.*;
import android.media.*;
import android.widget.Toast.*;
import android.app.Activity;
import android.widget.EditText.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import android.app.Activity;
import android.content.Context;
import android.database.SQLException;
import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Im;
import android.util.Log;
public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        Toast.makeText(this,"ver.1.1",Toast.LENGTH_LONG).show();
		requestWindowFeature(Window.FEATURE_NO_TITLE);
     	setContentView(R.layout.main);
		startActivity(new Intent(this, SplashActivity.class));
	
					{Button Button1 = (Button) findViewById(R.id.Button2);

						Button1.setOnClickListener(new OnClickListener(){ public void onClick(View v){
									Intent i=new Intent(MainActivity.this,m1.class);
									startActivity(i);}
					{Button Button1 = (Button) findViewById(R.id.Button3);

						Button1.setOnClickListener(new OnClickListener(){ public void onClick(View v){
									Intent i=new Intent(MainActivity.this,m2.class);
									startActivity(i);}
								{Button Button1 = (Button) findViewById(R.id.Button1); Button1.setOnClickListener(new OnClickListener() { public void onClick(View v) { Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.hwahong.ms.kr/")); startActivity(myIntent);}
							});}});}});};;;}}
