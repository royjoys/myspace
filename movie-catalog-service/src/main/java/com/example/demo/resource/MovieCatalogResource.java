package com.example.demo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Movie;
import com.example.demo.service.MovieCatalogService;

@RestController
@RequestMapping("/rest")
public class MovieCatalogResource {
	
	@Autowired
	MovieCatalogService movieCatalogService;
	
	@GetMapping("/movie")
	public String movieCatalog() {
		return "Movie";
	}
	
	@GetMapping("/movie/json")
	public Movie movieCatalogJson() {
		return movieCatalogService.getMovie();
		
	}


}
