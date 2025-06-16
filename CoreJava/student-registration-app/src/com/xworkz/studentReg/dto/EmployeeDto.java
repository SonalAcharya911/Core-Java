package com.xworkz.studentReg.dto;

public class EmployeeDto {
    private int employeeId;
    private String name;
    private double salary;

    public EmployeeDto(){
        System.out.println("running no-arg constructor of EmployeeDto");
    }

    public EmployeeDto(int employeeId, String name,double salary){
        this.employeeId=employeeId;
        this.name=name;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "employeeId: " + employeeId + "name: " + name + "salary: " + salary;
    }


}
