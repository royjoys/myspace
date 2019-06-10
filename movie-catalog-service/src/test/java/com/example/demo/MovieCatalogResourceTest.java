package com.example.demo;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.model.Movie;
import com.example.demo.resource.MovieCatalogResource;
import com.example.demo.service.MovieCatalogService;

@RunWith(SpringJUnit4ClassRunner.class)
public class MovieCatalogResourceTest {

	MockMvc mock;
	
	@Mock
	MovieCatalogService movieCatalogService;

	@InjectMocks
	MovieCatalogResource movieCatalogResource;

	@Before
	public void setUp() throws Exception {
		mock = standaloneSetup(movieCatalogResource).build();
	}

	@Test
	public void testMovieCatalog() throws Exception {
		mock.perform(get("/rest/movie"))
			.andExpect(status().isOk())
			.andExpect(content().string("Movie"));
	}
	
	@Test
	public void testMovieCatalogJson() throws Exception {
		when(movieCatalogService.getMovie()).thenReturn(new Movie("m1", "Movie Name", "Movie Desc", "8.5"));
		mock.perform(get("/rest/movie/json"))
			.andExpect(status().isOk())
			.andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
			.andExpect(jsonPath("$.name", Matchers.is("Movie Name")));
		verify(movieCatalogService).getMovie();
	}

}
