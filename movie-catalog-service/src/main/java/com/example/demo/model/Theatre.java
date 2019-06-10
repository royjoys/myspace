package com.example.demo.model;

import java.util.List;

public class Theatre {

	private String id;
	private String name;
	private String location;
	private List<Movie> movies;

	public Theatre() {
	}

	public Theatre(String id, String name, String location, List<Movie> movies) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.movies = movies;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
