package com.hng12.backend.model;

public class Response {
    private String email;
    private String current_datetime;
    private String github_url;

    public Response(String email, String current_datetime, String github_url) {
        this.email = email;
        this.current_datetime = current_datetime;
        this.github_url = github_url;
    }

    public String getEmail() {
        return email;
    }

    public String getcurrent_datetime() {
        return current_datetime;
    }

    public String getgithub_url() {
        return github_url;
    }
}
