package com.customlistview;

public class MovieDataProvider {

	private int movie_poster_resource;
	private String movie_titles_resource;
	private String movie_collections_resource;

	public int getMovie_poster_resource() {
		return movie_poster_resource;
	}

	public MovieDataProvider(int movie_poster_resource,
			String movie_titles_resource, String movie_collections_resource) {
		
		this.setMovie_poster_resource(movie_poster_resource);
		this.setMovie_titles_resource(movie_titles_resource);
		this.setMovie_collections_resource(movie_collections_resource);
	}

	public void setMovie_poster_resource(int movie_poster_resource) {
		this.movie_poster_resource = movie_poster_resource;
	}

	public String getMovie_titles_resource() {
		return movie_titles_resource;
	}

	public void setMovie_titles_resource(String movie_titles_resource) {
		this.movie_titles_resource = movie_titles_resource;
	}

	public String getMovie_collections_resource() {
		return movie_collections_resource;
	}

	public void setMovie_collections_resource(String movie_collections_resource) {
		this.movie_collections_resource = movie_collections_resource;
	}

}
