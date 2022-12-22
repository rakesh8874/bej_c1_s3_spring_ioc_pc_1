package com.configration;

import com.domain.Department;
import com.domain.Employee;
import org.springframework.context.annotation.Bean;

public class EmployeeConfig {

    @Bean("emp1")
    public Employee getEmployeeDetails1(){
        Employee employee = new Employee();
        employee.setEmployeeId(101);
        employee.setEmployeeAge(27);
        employee.setName("Shivankit");
        return employee;
    }

    @Bean("dpt1")
    public Department getDepartment1(){
        return new Department("Sales","Manager");
    }
    @Bean("dpt2")
    public Department getDepartment2(){
        Department department = new Department();
        department.setEmployeeDepartment("IT");
        department.setEmployeeDesignation("ProjectManager");
        return department;
    }
}
