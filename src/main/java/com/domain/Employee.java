package com.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
    private int employeeId;
    private String name;
    private int employeeAge;
//    @Autowired
//    @Qualifier("dpt1")
    private Department department;

    public Employee(int employeeId, String name, int employeeAge, Department department) {
        this.employeeId = employeeId;
        this.name = name;
        this.employeeAge = employeeAge;
        this.department = department;
    }
    public Employee(){

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public Department getDepartment() {
        return department;
    }

    @Autowired
    @Qualifier("dpt2")
    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", employeeAge=" + employeeAge +
                ", department=" + department +
                '}';
    }
}
