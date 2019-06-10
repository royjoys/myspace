package com.example.demo.model;

public class Movie {
	
	private String movieId;
	private String name;
	private String desc;
	private String rating;
	
	public Movie(String movieId, String name, String desc, String rating) {
		this.movieId = movieId;
		this.name = name;
		this.desc = desc;
		this.rating = rating;
	}
	public Movie(String movieId, String name, String desc) {
		this.movieId = movieId;
		this.name = name;
		this.desc = desc;
	}
	public Movie() {
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", name=" + name + ", desc=" + desc + ", rating=" + rating + "]";
	}
	
	

}
