package com.customlistview;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MovieAdapter extends ArrayAdapter<Object> {

	List<Object> list = new ArrayList<Object>();

	public MovieAdapter(Context context, int resource) {
		super(context, resource);
		// TODO Auto-generated constructor stub
	}

	static class DataHandler {

		ImageView poster;
		TextView title;
		TextView collection;
	}

	@Override
	public void add(Object object) {
		super.add(object);
		list.add(object);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return this.list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return this.list.get(position);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View row;
		row = convertView;
		DataHandler dataHandler;
		if (convertView == null) {
			LayoutInflater inflater = (LayoutInflater) this.getContext()
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			row = inflater.inflate(R.layout.row_layout, parent, false);
			dataHandler = new DataHandler();
			dataHandler.poster = (ImageView) row.findViewById(R.id.movie_poster);
			dataHandler.title = (TextView) row.findViewById(R.id.movie_title);
			dataHandler.collection = (TextView) row.findViewById(R.id.movie_collections);
			row.setTag(dataHandler);
		}
		else {
			dataHandler = (DataHandler) row.getTag();
		}
		MovieDataProvider dataProvider;
		dataProvider = (MovieDataProvider) this.getItem(position);
		dataHandler.poster.setImageResource(dataProvider.getMovie_poster_resource());
		dataHandler.title.setText(dataProvider.getMovie_titles_resource());
		dataHandler.collection.setText(dataProvider.getMovie_collections_resource());
		return row;
	}
}
