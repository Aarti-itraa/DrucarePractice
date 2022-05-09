package com.drucare.RatingsDataService.Controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drucare.RatingsDataService.entity.Rating;

@RestController
public class RatingsDataController {

	@RequestMapping("/ratingsdata/{movieId}")
	public List<Rating> getUserRating(@PathVariable String movieId){
		return Collections.singletonList(new Rating("424", 4));
	}
}
