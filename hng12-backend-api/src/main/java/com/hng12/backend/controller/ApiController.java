package com.hng12.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ApiController {

    @GetMapping("/api")
    public Map<String, String> getInfo() {
        Map<String, String> response = new HashMap<>();
        response.put("email", "ianmongi45@gmail.com");
        response.put("current_datetime", getCurrentDatetime());
        response.put("github_url", "https://github.com/Ellyian/API-JAVA");
        return response;
    }

    private String getCurrentDatetime() {
        LocalDateTime now = LocalDateTime.now(ZoneId.of("UTC"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
        return now.format(formatter);
    }
}
