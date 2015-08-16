package com.customlistview;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class MainActivity extends Activity {

	ListView listview;
	String[] movie_titles;
	String[] movie_collections;
	MovieAdapter movieAdapter;
	/*
	 * String[] movie_titles = { "Baahubali", "Srimanthudu",
	 * "Attarintiki Daredi", "Magadheera", "Gabbar Singh", "Race Gurram",
	 * "Dookudu" };
	 * 
	 * String[] movie_collections = { "INR 280cr", "INR 80cr", "INR 80cr",
	 * "INR 80cr", "INR 80cr", "INR 80cr", "INR 80cr" };
	 */

	int[] movie_posters = { R.drawable.bahubali, R.drawable.svse,
			R.drawable.atharintiki, R.drawable.magadheera,
			R.drawable.gabbarsingh, R.drawable.alluarjun, R.drawable.dookudu };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		listview = (ListView) findViewById(R.id.list_view);
		movie_titles = getResources().getStringArray(R.array.movie_titles);
		movie_collections = getResources().getStringArray(
				R.array.movie_collections);
		int i = 0;
		movieAdapter = new MovieAdapter(getApplicationContext(),
				R.layout.row_layout);
		listview.setAdapter(movieAdapter);
		for (String titles : movie_titles) {

			MovieDataProvider dataProvider = new MovieDataProvider(
					movie_posters[i], titles, movie_collections[i]);
			movieAdapter.add(dataProvider);
			i++;
		}
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
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
