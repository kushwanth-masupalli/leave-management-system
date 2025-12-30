package com.example.leavemanagement.dto;

public class LeaveRequestInput {
    private Long empid;
    private String fromDate; // yyyy-MM-dd
    private String toDate;
    private String reason;

    public LeaveRequestInput(Long empid, String fromDate, String toDate, String reason) {
        this.empid = empid;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.reason = reason;
    }

    public Long getEmpid() {
        return empid;
    }

    public void setEmpid(Long empid) {
        this.empid = empid;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
