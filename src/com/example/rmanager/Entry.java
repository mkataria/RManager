package com.example.rmanager;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.support.v4.app.NavUtils;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import com.google.*;
import com.google.api.client.*;

public class Entry extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_entry);
		// Show the Up button in the action bar.

		 mGoogleApiClient = new GoogleApiClient.Builder(this)
         .addApi(Drive.API)
         .addScope(Drive.SCOPE_FILE)
         .addConnectionCallbacks(this)
         .addOnConnectionFailedListener(this)
         .build();
		
	}
	
	
	public void txtOther_onClick(View v)
	{
		TextView tv = (TextView)findViewById(R.id.txtOther);
		if(tv.getText() == this.getString( R.string.other))
			tv.setText("");
	}
	
	
}
