package com.example.leavemanagement.controller;


import com.example.leavemanagement.dto.LeaveRequestInput;
import com.example.leavemanagement.entity.LeaveRequest;
import com.example.leavemanagement.service.LeaveRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/leaverequest/")
public class LeaveRequestController {

    @Autowired
    LeaveRequestService leaveRequestService;


    @PostMapping("/create")
    public ResponseEntity<LeaveRequest> createLeaveRequest(@RequestBody LeaveRequestInput input) {
        LeaveRequest leaveRequest = leaveRequestService.applyLeave(
                input.getEmpid(),
                input.getFromDate(),
                input.getToDate(),
                input.getReason()
        );
        return new ResponseEntity<>(leaveRequest, HttpStatus.CREATED);
    }


}
