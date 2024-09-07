package com.code.CodeReview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.code.CodeReview.model.MyRequest;
import com.code.CodeReview.model.MyResponse;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

@Service
public class ApiService {

    private final String YOUR_API_KEY = "AIzaSyC0eIt7C8Rlr9-tUAQSO7kfq-GCWLHDuNY";

    private final String API_URL = "https://generativelanguage.googleapis.com/v1beta/models/gemini-1.5-flash-latest:generateContent?key=" + YOUR_API_KEY;

    @Autowired
    private RestTemplate restTemplate;

    public ResponseEntity<MyResponse> generateContent(MyRequest requestBody) {

        // Create headers
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");

     
        // Create HttpEntity
        HttpEntity<MyRequest> entity = new HttpEntity<>(requestBody, headers);

        // Make POST request
        ResponseEntity<MyResponse> response = restTemplate.exchange(API_URL, HttpMethod.POST, entity, MyResponse.class);

        // Return response
        return response;
    }
}
