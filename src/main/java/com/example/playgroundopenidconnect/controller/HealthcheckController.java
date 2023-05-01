package com.example.playgroundopenidconnect.controller;// src/main/java/com/auth0/example/web/APIController.java

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class HealthcheckController {

    @GetMapping(path = "healthcheck")
    public String healthcheck() {
        return "OK";
    }

}