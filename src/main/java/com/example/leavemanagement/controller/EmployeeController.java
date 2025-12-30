package com.example.leavemanagement.controller;


import com.example.leavemanagement.entity.Employee;
import com.example.leavemanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService empserice ;


    @GetMapping("/api/employees")
    public List<Employee> getEmployee(){
         return empserice.getAllEmployee();
    }


    @PostMapping("/api/employees")
    public Employee postEmployee(@RequestBody  Employee obj ){
        return empserice.postEmployee(obj);
    }



}
