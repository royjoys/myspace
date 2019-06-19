package com.example.demo.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Movie;

@RestController
@RequestMapping("/rating")
public class MovieRatingResource {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/{movieId}")
	public Movie movieCatalog(@PathVariable(name = "movieId") String movieId) {
		log.info("Inside movieCatalog with "+movieId );
		Movie m = new Movie();
		m.setRating("8.5");
		m.setPort(
				Integer.parseInt(environment.getProperty("local.server.port")));
		return m;
	}
	
	


}
