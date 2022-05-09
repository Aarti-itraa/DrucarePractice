package com.drucare.MovieCatalogService.Controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.drucare.MovieCalatalogService.entity.CatalogItem;
import com.drucare.MovieCalatalogService.entity.Movie;
import com.drucare.MovieCalatalogService.entity.Rating;

@RestController
public class MovieCatalogController {

	@Autowired
	RestTemplate restTemplate;
	@RequestMapping("/catalog/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable String userId){

		RestTemplate restTemplate = new RestTemplate();

		List<Rating>ratingList =  Arrays.asList(new Rating("1234",4),
				new Rating("5678",3));
		/*      ratingList.stream().map(rating ->
			new CatalogItem("RRR","Action-Drama", 4)).Collect(Collectors.toList());*/    

		return ratingList.stream()
				.map(rating -> {
					Movie movie = restTemplate.getForObject("http://localhost:8083/movies/4", Movie.class);
					return new CatalogItem(movie.getName(),"Rajamouli film",rating.getRating());
				}).collect(Collectors.toList());


	}


}