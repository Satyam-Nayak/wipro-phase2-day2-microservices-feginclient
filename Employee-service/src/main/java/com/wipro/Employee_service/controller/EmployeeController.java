package com.wipro.Employee_service.controller;

import com.wipro.Employee_service.entity.Employee;
import com.wipro.Employee_service.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }

    @GetMapping("/{id}/company")
    public Object getEmployeeWithCompany(@PathVariable Long id) {
        return employeeService.getEmployeeWithCompany(id);
    }

    @GetMapping("/{id}/project")
    public Object getEmployeeWithProject(@PathVariable Long id) {
        return employeeService.getEmployeeWithProject(id);
    }
}
