package com.wipro.Employee_service.service;

import com.wipro.Employee_service.entity.Employee;
import com.wipro.Employee_service.feign.CompanyClient;
import com.wipro.Employee_service.feign.ProjectClient;
import com.wipro.Employee_service.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private CompanyClient companyClient;

    @Autowired
    private ProjectClient projectClient;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
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

    public Object getEmployeeWithCompany(Long employeeId) {
        Optional<Employee> employee = employeeRepository.findById(employeeId);
        if (employee.isPresent()) {
            Object company = companyClient.getCompanyById(employee.get().getCompanyId());
            return company;
        }
        return null;
    }

    public Object getEmployeeWithProject(Long employeeId) {
        Optional<Employee> employee = employeeRepository.findById(employeeId);
        if (employee.isPresent()) {
            Object project = projectClient.getProjectById(employee.get().getProjectId());
            return project;
        }
        return null;
    }
}
