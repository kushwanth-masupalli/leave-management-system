package com.example.leavemanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empid;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private Integer totalLeaves;

    @Column(nullable = false)
    private Integer usedLeaves;

    protected Employee() {
        // Hibernate requires default constructor
    }

    public Employee(String name, String email, Integer totalLeaves, Integer usedLeaves) {
        this.name = name;
        this.email = email;
        this.totalLeaves = totalLeaves;
        this.usedLeaves = usedLeaves;
    }

    public Long getEmpid() {
        return empid;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Integer getTotalLeaves() {
        return totalLeaves;
    }

    public Integer getUsedLeaves() {
        return usedLeaves;
    }

    public int getRemainingLeaves() {
        return totalLeaves - usedLeaves;
    }
}
