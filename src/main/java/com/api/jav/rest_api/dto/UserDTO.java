package com.api.jav.rest_api.dto;

public class UserDTO {
    
    private int id;
    private String name;
    private String email;
    private String phNo;
    private String password;
    private String address;
    private int age;
    private int cash;

    // Constructors, getters, and setters

    public UserDTO() {}

    public UserDTO(int id, String name, String email, String phNo, String password,
            String address, int age, int cash) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

