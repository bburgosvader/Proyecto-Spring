package com.segundo.proyectojava.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.segundo.proyectojava.service.HealthService;



@RestController
@RequestMapping("/health")


public class HealthController {

    @Autowired
    private HealthService healthService;


    @GetMapping
    public String healthCheck(){
        return healthService.healthCheck();
    }


}
