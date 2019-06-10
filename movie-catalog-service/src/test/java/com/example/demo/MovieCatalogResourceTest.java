package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.resource.MovieCatalogResource;

@RunWith(SpringJUnit4ClassRunner.class)
public class MovieCatalogResourceTest {

	MockMvc mock;

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

}
