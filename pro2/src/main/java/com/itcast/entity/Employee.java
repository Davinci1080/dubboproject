package com.itcast.entity;

import java.io.Serializable;

public class Employee implements Serializable {

    private static final Long serialVersionUID = 1L;

    private Integer empiId;
    private String empName;
    private Double salary;

    public Employee (){}

    public Employee(Integer empiId, String empName, Double salary) {
        this.empiId = empiId;
        this.empName = empName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empiId=" + empiId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Integer getEmpiId() {
        return empiId;
    }

    public void setEmpiId(Integer empiId) {
        this.empiId = empiId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
