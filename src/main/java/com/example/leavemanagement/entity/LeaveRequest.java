package com.example.leavemanagement.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "leave_requests")
public class LeaveRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "empid", nullable = false)
    private Employee employee;

    @Column(name = "from_date", nullable = false)
    private LocalDate fromDate;

    @Column(name = "to_date", nullable = false)
    private LocalDate toDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private LeaveStatus status;

    @Column(nullable = false)
    private String reason;

    protected LeaveRequest() {
        // Hibernate requires default constructor
    }

    public LeaveRequest(Employee employee, LocalDate fromDate, LocalDate toDate, LeaveStatus status, String reason) {
        this.employee = employee;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.status = status;
        this.reason = reason;
    }

    public Long getId() {
        return id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public LeaveStatus getStatus() {
        return status;
    }

    public String getReason() {
        return reason;
    }

    public void setStatus(LeaveStatus status) {
        this.status = status;
    }
}
