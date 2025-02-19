package com.wipro.Day3.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Project {
    public int id;
    public String name;
    public String description;
    public String status;
    public String start_date;
    public String end_date;
    public String poc;
    public String poc_email;
    public double budget;
    public Long pcode;

    public Project(){

    }

    public Project(int id, String name, String description, String status, String start_date, String end_date, String poc, String poc_email, double budget, Long pcode) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = status;
        this.start_date = start_date;
        this.end_date = end_date;
        this.poc = poc;
        this.poc_email = poc_email;
        this.budget = budget;
        this.pcode = pcode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getPoc() {
        return poc;
    }

    public void setPoc(String poc) {
        this.poc = poc;
    }

    public String getPoc_email() {
        return poc_email;
    }

    public void setPoc_email(String poc_email) {
        this.poc_email = poc_email;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Long getPcode() {
        return pcode;
    }

    public void setPcode(Long pcode) {
        this.pcode = pcode;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", start_date='" + start_date + '\'' +
                ", end_date='" + end_date + '\'' +
                ", poc='" + poc + '\'' +
                ", poc_email='" + poc_email + '\'' +
                ", budget=" + budget +
                ", pcode=" + pcode +
                '}';
    }
}
