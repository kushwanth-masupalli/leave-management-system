package com.example.leavemanagement.controller;


import com.example.leavemanagement.dto.HealthResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {


       @GetMapping("/api/health")
       public HealthResponse healthcheckup(){
          return new HealthResponse("up","leave management system");
      }

}
