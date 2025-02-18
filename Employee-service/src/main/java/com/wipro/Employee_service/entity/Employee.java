package com.wipro.Employee_service.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false) // Name cannot be null
    private String name;

    private String designation;
    private Double salary;

    @ManyToOne
    @JoinColumn(name = "pcode", referencedColumnName = "pcode", nullable = false)
    private Project project;

    @Version // Helps handle concurrent updates
    private Integer version;

    // Default Constructor (Required by JPA)
    public Employee() {
    }

    // Parameterized Constructor
    public Employee(Long id, String name, String designation, Double salary, Project project) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.project = project;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
