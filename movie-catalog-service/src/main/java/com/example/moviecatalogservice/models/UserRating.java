package com.example.moviecatalogservice.models;

import java.util.List;

public class UserRating {

	private List<Rating> userRating; 
	
	public UserRating() {
		// Default constructor
	}
	
	public List<Rating> getUserRating() {
		return userRating;
	}
	
	public void setUserRating(List<Rating> userRating) {
		this.userRating = userRating;
	}
}
