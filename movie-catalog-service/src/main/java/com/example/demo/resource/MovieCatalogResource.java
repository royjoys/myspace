package com.example.demo.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Movie;
import com.example.demo.model.Theatre;
import com.example.demo.service.MovieCatalogService;

@RestController
@RequestMapping("/theatre")
public class MovieCatalogResource {

	@Autowired
	MovieCatalogService movieCatalogService;

	@Autowired
	RestTemplate restTemplate;

	/*
	 * @GetMapping("/movie") public String movieCatalog() { return "Movie"; }
	 */

	@GetMapping("/{name}/{location}/movies")
	public Theatre movieCatalogJson(@PathVariable(name = "name") String name,
			@PathVariable(name = "location") String location) {
		List<Movie> movies = movieCatalogService.getMovies(name);
		movies = movies.stream()
				.map(this::getRating)
				.collect(Collectors.toList());
		Theatre t = new Theatre("1", name, location, movies);
		return t;

	}

	private Movie getRating(Movie m) {

		Movie forObject = restTemplate.getForObject("http://MOVIE-RATING-SERVICE/rating/" + m.getMovieId(), Movie.class);
		m.setRating(forObject.getRating());
		return m;
	}

}
