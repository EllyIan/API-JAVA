package com.hng12.backend.model;

public class Response {
    private String email;
    private String currentDatetime;
    private String githubUrl;

    public Response(String email, String currentDatetime, String githubUrl) {
        this.email = email;
        this.currentDatetime = currentDatetime;
        this.githubUrl = githubUrl;
    }

    public String getEmail() {
        return email;
    }

    public String getCurrentDatetime() {
        return current_datetime;
    }

    public String getGithubUrl() {
        return git_hubUrl;
    }
}
