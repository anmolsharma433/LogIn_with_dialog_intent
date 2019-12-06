package com.example.dayfirst.Employee;

public final class FullTime extends Employee{

    // create variables for stroing values

    int salary;
    int bonus;

    // constructor to input all values


    public FullTime(int employeeID, String employeeName, int employeeAge, int salary, int bonus) {
        super(employeeID, employeeName, employeeAge);
        this.salary = salary;
        this.bonus = bonus;
    }
    //getter and setter
    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = (int) salary;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = (int) bonus;
    }


    //override abstract function to calculate salary
    @Override
    public float calcEarnings() {
        float totalSalary = salary+bonus;
        return totalSalary;

    }


}
