package com.api.jav.rest_api.dto;

public class MovieDTO {
	
	 	private int movieId;
		private String movieName;
		private String director;
		private String price;
		private String movieCategory;
		private String status;
		private String genre;
		private String year;
		private int quantity;

	    // Constructors, getters, and setters

	    public MovieDTO() {}

		public MovieDTO(int movieId, String movieName, String director, String price, String movieCategory,
				String status, String genre, String year, int quantity) {
			super();
			this.movieId = movieId;
			this.movieName = movieName;
			this.director = director;
			this.price = price;
			this.movieCategory = movieCategory;
			this.status = status;
			this.genre = genre;
			this.year = year;
			this.quantity = quantity;
		}

		public int getMovieId() {
			return movieId;
		}

		public void setMovieId(int movieId) {
			this.movieId = movieId;
		}

		public String getMovieName() {
			return movieName;
		}

		public void setMovieName(String movieName) {
			this.movieName = movieName;
		}

		public String getDirector() {
			return director;
		}

		public void setDirector(String director) {
			this.director = director;
		}

		public String getPrice() {
			return price;
		}

		public void setPrice(String price) {
			this.price = price;
		}

		public String getMovieCategory() {
			return movieCategory;
		}

		public void setMovieCategory(String movieCategory) {
			this.movieCategory = movieCategory;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getGenre() {
			return genre;
		}

		public void setGenre(String genre) {
			this.genre = genre;
		}

		public String getYear() {
			return year;
		}

		public void setYear(String year) {
			this.year = year;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		
		
	    
}
