package com.example.leavemanagement.service;


import com.example.leavemanagement.entity.Employee;
import com.example.leavemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

   @Autowired
   EmployeeRepository er ;

   public List<Employee> getAllEmployee() {
      return er.findAll();
   }


   public Employee postEmployee(Employee obj) {
      return er.save(obj);
   }
}
