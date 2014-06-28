package com.example.browsercallingexample;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void invocarBrowser(View view) {
		Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
		startActivity(browserIntent);
		
//		Intent search = new Intent(Intent.ACTION_WEB_SEARCH); 
//		search.putExtra(SearchManager.QUERY, "videogames");
//		startActivity(search);
	}
}
