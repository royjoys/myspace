package com.example.demo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Movie;

@RestController
@RequestMapping("/rating")
public class MovieRatingResource {
	
	
	
	@GetMapping("/{movieId}")
	public Movie movieCatalog(@PathVariable(name = "movieId") String movieId) {
		Movie m = new Movie();
		m.setRating("8.5");
		return m;
	}
	
	


}
