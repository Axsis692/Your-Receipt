package com.example.tabbar2;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

	//final Resources res = getResources();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TabHost mTabHost = getTabHost();
		mTabHost.addTab(mTabHost.newTabSpec("list").setIndicator("Lista").setContent(new Intent(this  ,AppList.class )));
		mTabHost.addTab(mTabHost.newTabSpec("new").setIndicator("Dodaj").setContent(new Intent(this  ,AppNew.class )));
		mTabHost.addTab(mTabHost.newTabSpec("settings").setIndicator("Ustawienia").setContent(new Intent(this  ,AppSettings.class )));
		mTabHost.setCurrentTab(0);
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) 
		{
			return true;
		}
		return super.onOptionsItemSelected(item);
		
	}
}
