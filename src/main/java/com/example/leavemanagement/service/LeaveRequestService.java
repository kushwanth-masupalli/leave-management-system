package com.example.leavemanagement.service;

import com.example.leavemanagement.entity.Employee;
import com.example.leavemanagement.entity.LeaveRequest;
import com.example.leavemanagement.entity.LeaveStatus;
import com.example.leavemanagement.repository.EmployeeRepository;
import com.example.leavemanagement.repository.LeaveRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class LeaveRequestService {

     @Autowired
     LeaveRequestRepository leaveRequestRepository;
     @Autowired
     EmployeeRepository employeeRepository ;


    public LeaveRequest applyLeave(Long empid, String fromDate, String toDate, String reason) {

        Employee emp = employeeRepository.findById(empid).orElse(null);

     return    leaveRequestRepository.save(new LeaveRequest(emp, LocalDate.parse(fromDate),LocalDate.parse(toDate), LeaveStatus.PENDING,reason));


    }
}
