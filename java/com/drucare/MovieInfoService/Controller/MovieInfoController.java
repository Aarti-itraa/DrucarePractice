package com.drucare.MovieInfoService.Controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drucare.MovieInfoService.entity.Movie;

@RestController
public class MovieInfoController {

	@RequestMapping("/movie/{movieId}")
	public List<Movie> getMovieInfo(@PathVariable String movieId){
		
		return Collections.singletonList(new Movie("546","Pushpa"));
		
	}
}
