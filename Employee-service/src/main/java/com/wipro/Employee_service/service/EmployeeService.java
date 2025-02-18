package com.wipro.Employee_service.service;

import com.wipro.Employee_service.entity.Employee;
import com.wipro.Employee_service.entity.Project;
import com.wipro.Employee_service.repository.EmployeeRepository;
import com.wipro.Employee_service.repository.ProjectRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ProjectRepository projectRepository;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.saveAndFlush(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    public Optional<Project> getProjectByPcode(Long pcode) {
        return projectRepository.findByPcode(pcode);
    }
}
