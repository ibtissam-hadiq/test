package com.example.crupjsp;

public class User {
    private int id;
    private String name;
    private String password;
    private String email;
    private String sex;
    private String country;
    public User(){

    }


    public User(int id, String name, String password, String email, String sex, String country) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.sex = sex;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getSex() {
        return sex;
    }

    public String getCountry() {
        return country;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

