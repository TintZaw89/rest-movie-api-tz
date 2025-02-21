package com.api.jav.rest_api.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
//import jakarta.persistence.Table;

@Entity
//@Table(name = "user")
public class User{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "phNo")
    private String phNo;
    @Column(name = "password")
    private String password;
    @Column(name = "address")
    private String address;
	@Column(name = "age")
    private int age;
    @Column(name = "cash")
    private int cash;
    @ManyToMany
    @JoinTable(name = "friends", joinColumns = @JoinColumn(name = "who"), inverseJoinColumns = @JoinColumn(name = "with"))
    private List<User> friends;
    
    public User() {}
    
    public User(int id, String name, String email, String phNo, String password, String address, int age,
			int cash) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phNo = phNo;
		this.password = password;
		this.address = address;
		this.age = age;
		this.cash = cash;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhNo() {
		return phNo;
	}

	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCash() {
		return cash;
	}

	public void setCash(int cash) {
		this.cash = cash;
	}
    
    
}