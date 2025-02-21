package com.api.jav.rest_api.dto;

public class MovieOrderDTO {
	
    private String userId;

	private String orderId;
	private String userName;
	private String address;
	private String phone;
	private String movieName;
	private String director;
	private String price;
	private String paymentType;
	private String email;
	
	public MovieOrderDTO() {
	}

	public MovieOrderDTO(String userId, String orderId, String userName, String address, String phone, String movieName,
			String director, String price, String paymentType, String email) {
		super();
		this.userId = userId;
		this.orderId = orderId;
		this.userName = userName;
		this.address = address;
		this.phone = phone;
		this.movieName = movieName;
		this.director = director;
		this.price = price;
		this.paymentType = paymentType;
		this.email = email;
	}
	
	public String getuserId() {
		return userId;
	}

	public void setuserId(String userId) {
		this.userId = userId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
