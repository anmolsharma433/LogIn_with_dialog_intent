package com.example.dayfirst.Employee;

public final class Intern extends Employee{

    // create variables for stroing values
    private String schoolName;
    private int salary;

    //constructor to get values
    public Intern(int employeeID, String employeeName, int employeeAge, String schoolName, int salary) {
        super(employeeID, employeeName, employeeAge);
        this.schoolName = schoolName;
        this.salary = salary;
    }

    //getter and setter
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //override abstract function to calculate salary
    @Override
    public float calcEarnings() {
        return 0;
    }

}
