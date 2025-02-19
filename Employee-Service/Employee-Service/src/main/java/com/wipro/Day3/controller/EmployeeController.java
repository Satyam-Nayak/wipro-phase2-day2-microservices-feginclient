package com.wipro.Day3.controller;

import com.wipro.Day3.entity.Employee;
import com.wipro.Day3.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping
    public Employee createCompany(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }
}
