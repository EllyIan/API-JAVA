/**package com.hng12.backend.controller;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.hng12.backend.model.Response;
import com.hng12.backend.service.ApiService;

@WebMvcTest(ApiController.class)
public class ApiControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ApiService apiService;

    @Test
    public void testGetInfo() throws Exception {
        Response response = new Response("ianmongi45@gmail.com", "2025-01-30T09:30:00Z", "https://github.com/Ellyian/API-JAVA");
        when(apiService.getResponse()).thenReturn(response);

        mockMvc.perform(get("/api"))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"email\":\"ianmongi45@gmail.com\",\"current_datetime\":\"2025-01-30T09:30:00Z\",\"github_url\":\"https://github.com/Ellyian/API-JAVA\"}"));
    }

    @Test
    public void testGetInfoWithDifferentEmail() throws Exception {
        Response response = new Response("different-email@example.com", "2025-01-30T09:30:00Z", "https://github.com/Ellyian/JAPI-JAVA");
        when(apiService.getResponse()).thenReturn(response);

        mockMvc.perform(get("/api"))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"email\":\"different-email@example.com\",\"currentDatetime\":\"2025-01-30T09:30:00Z\",\"github_url\":\"https://github.com/Ellyian/API-JAVA\"}"));
    }

    @Test
    public void testGetInfoWithDifferentDatetime() throws Exception {
        Response response = new Response("ianmongi45@gmail.com", "2025-02-01T10:00:00Z", "https://github.com/Ellyian/API-JAVA");
        when(apiService.getResponse()).thenReturn(response);

        mockMvc.perform(get("/api"))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"email\":\"ianmongi45@gmail.com\",\"currentDatetime\":\"2025-02-01T10:00:00Z\",\"github_url\":\"https://github.com/Ellyian/API-JAVA\"}"));
    }

    @Test
    public void testGetInfoWithDifferentGithubUrl() throws Exception {
        Response response = new Response("ianmongi45@gmail.com", "2025-01-30T09:30:00Z", "https://github.com/different/repo");
        when(apiService.getResponse()).thenReturn(response);

        mockMvc.perform(get("/api"))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"email\":\"ianmongi45@gmail.com\",\"current_datetime\":\"2025-01-31T11:02:53Z ",\"github_url\":\"https://github.com/different/repo\"}"));
    }

    @Test
    public void testGetInfoWithError() throws Exception {
        doThrow(new RuntimeException("Internal Server Error")).when(apiService).getResponse();

        mockMvc.perform(get("/api"))
                .andExpect(status().isInternalServerError())
                .andExpect(content().string("Internal Server Error"));
    }

    @Test
    public void testGetInfoWithMissingParams() throws Exception {
        Response response = new Response(null, null, null);
        when(apiService.getResponse()).thenReturn(response);

        mockMvc.perform(get("/api"))
                .andExpect(status().isBadRequest())
                .andExpect(content().string("Missing required parameters"));
    }
}**/
