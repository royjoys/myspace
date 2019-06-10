package com.example.demo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class MovieCatalogResource {
	
	@GetMapping("/movie")
	public String movieCatalog() {
		return "Movie";
	}

}
