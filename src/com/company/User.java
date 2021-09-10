package com.company;

public class User {
    private static int maxId = 0;
    private int id;
    private String password;
    private String email;
    private String name;



    public User(String password, String email, String name) {
        maxId--;
        maxId++;
        id = maxId;
        this.password = password;
        this.email = email;
        this.name = name;


    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String setPassword(Object o) {
        this.password = password;
        return password;
    }

    public String setEmail(Object o) {
        this.email = email;
        return email;
    }

    public String setName(Object o) {
        this.name = name;
        return name;
    }

    public static int getMaxId() {
        return maxId;
    }

}
