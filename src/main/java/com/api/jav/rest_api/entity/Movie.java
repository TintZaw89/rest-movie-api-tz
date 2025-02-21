package com.api.jav.rest_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movie_dtls") // Optional: Specify table name explicitly
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int movieId;
    
	private String movieName;
	private String director;
	private String price;
	private String movieCategory;
	private String status;
	private String photoName;
	private String email;
	private String genre;
	private String year;
	private String video;
	private int quantity;
	
	public Movie() {
	}
	
	public Movie( String movieName, String director, String price, String movieCategory, String status,
		 String genre, String year, int quantity) {
		super();
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

	public String getPhotoName() {
		return photoName;
	}

	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", director=" + director + ", price=" + price
				+ ", movieCategory=" + movieCategory + ", status=" + status + ", photoName=" + photoName + ", email="
				+ email + ", genre=" + genre + ", year=" + year + ", video=" + video + ", quantity=" + quantity + "]";
	}
	
}