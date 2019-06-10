package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Movie;

@Service
public class MovieCatalogService {

	public Movie getMovie() {
		return new Movie("m1", "Movie Name", "Movie Desc", "8.5");
	}

}
