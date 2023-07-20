package com.apu.service.controllers;

import com.apu.service.responses.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public ResponseEntity<Response> testEndpoint() {
        Response response = new Response("service deployed and working", 200);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}