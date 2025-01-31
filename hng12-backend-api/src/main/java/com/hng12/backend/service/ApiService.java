package com.hng12.backend.service;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Service;

import com.hng12.backend.model.Response;

@Service
public class ApiService {

    public Response getResponse() {
        String email = "ianmongi45@gmail.com@gmail.com";
        String current_datetime = ZonedDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'"));
        String github_url = "https://github.com/Ellyian/API-JAVA";

        return new Response(email, currentDatetime, githubUrl);
    }
}
