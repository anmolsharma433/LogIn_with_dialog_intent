package com.example.dayfirst.Employee;

public final class CommisionBasedPartTime extends PartTime{


    // create variables for stroing values

    int commisionPercentage;

    // constructor to input all values


    public CommisionBasedPartTime(int employeeID, String employeeName, int employeeAge, float rate, int hoursWorked, int commisionPercentage) {
        super(employeeID, employeeName, employeeAge, rate, hoursWorked);
        this.commisionPercentage = commisionPercentage;
    }

    public int getCommisionPercentage() {
        return commisionPercentage;
    }

    public void setCommisionPercentage(int commisionPercentage) {
        this.commisionPercentage = commisionPercentage;
    }


    //override abstract function to calculate salary
    @Override
    public float calcEarnings() {

            // initialize new variables to temporary store commision and salary
            float salary = this.getRate() * this.getHoursWorked();
            float commision = salary * commisionPercentage/100;
            float totalSalary = commision+salary;
            return totalSalary;

        }
    }

