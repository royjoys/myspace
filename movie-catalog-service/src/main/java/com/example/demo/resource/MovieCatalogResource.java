package com.example.demo.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Movie;
import com.example.demo.model.Theatre;
import com.example.demo.service.MovieCatalogService;

@RestController
@RequestMapping("/theatre")
public class MovieCatalogResource {

	@Autowired
	MovieCatalogService movieCatalogService;

	/*
	 * @GetMapping("/movie") public String movieCatalog() { return "Movie"; }
	 */

	@GetMapping("/{name}/{location}/movies")
	public Theatre movieCatalogJson(@PathVariable(name = "name") String name,
			@PathVariable(name = "location") String location) {
		List<Movie> movies = movieCatalogService.getMovies(name);
		movies = movies.stream().map(m -> new Movie(m.getMovieId(), m.getName(), m.getDesc(), m.getRating()))
				.collect(Collectors.toList());
		Theatre t = new Theatre("1", name, location, movies);
		return t;

	}

}
