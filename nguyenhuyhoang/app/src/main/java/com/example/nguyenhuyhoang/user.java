package com.example.nguyenhuyhoang;

public class user {
    private String name;
    private String email;
    private String gripe;
    private String content;

    public user(){}
    public user(String name, String email, String gripe, String content) {
        this.name = name;
        this.email = email;
        this.gripe = gripe;
        this.content = content;
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

    public String getGripe() {
        return gripe;
    }

    public void setGripe(String gripe) {
        this.gripe = gripe;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
