package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Movie;

@Service
public class MovieCatalogService {

	public Movie getMovie() {
		return new Movie("m1", "Movie Name", "Movie Desc", "8.5");
	}

	public List<Movie> getMovies(String name) {
		return Arrays.asList(new Movie("m1", "Xmen", "Xmen Movie Desc"),
				new Movie("m2", "Avengers", "Avengers Movie Desc"),
				new Movie("m3", "Avatar", "Avatar Movie Desc"));
	}

}
