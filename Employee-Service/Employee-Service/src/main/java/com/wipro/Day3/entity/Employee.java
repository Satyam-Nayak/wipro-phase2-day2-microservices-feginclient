package com.wipro.Day3.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    public Long id;
    public String name;
    public String designation;
    public Double Salary;
    public int pid;
    public long pcode;

    public Employee(){
        super();
    }

    public Employee(Long id, String name, String designation, Double salary, int pid, long pcode) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        Salary = salary;
        this.pid = pid;
        this.pcode = pcode;
    }

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
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public long getPcode() {
        return pcode;
    }

    public void setPcode(long pcode) {
        this.pcode = pcode;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", Salary=" + Salary +
                ", pid=" + pid +
                ", pcode=" + pcode +
                '}';
    }
}
