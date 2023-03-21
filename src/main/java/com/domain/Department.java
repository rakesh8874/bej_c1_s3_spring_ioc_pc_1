package com.domain;

//This is pojo class
public class Department {
    private String employeeDepartment;
    private String employeeDesignation;

    public Department(String employeeDepartment, String employeeDesignation) {
        this.employeeDepartment = employeeDepartment;
        this.employeeDesignation = employeeDesignation;
    }
    public Department(){

    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    @Override
    public String toString() {
        return "Department{" +
                "employeeDepartment='" + employeeDepartment + '\'' +
                ", employeeDesignation='" + employeeDesignation + '\'' +
                '}';
    }
}
