package com.example.ratingsdataservice.models;

public class Rating {
	
	private String name;
	private int rating;
	
	public Rating() {
		// Default constrcutor
	}

	public Rating(String name, int rating) {
		this.setName(name);
		this.setRating(rating);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
}
