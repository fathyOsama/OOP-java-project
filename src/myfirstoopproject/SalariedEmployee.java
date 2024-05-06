/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfirstoopproject;

/**
 *
 * @author Fathy
 */
public class SalariedEmployee extends Employee2{
    double Bouns;
    double Deductions;
    public SalariedEmployee()
    {
    }
    public SalariedEmployee(String name, Double age, String address, String notionaliy,double salary,String rank,String job,double bouns,double deductions)
    {
    super(name, age, address, notionaliy,salary, rank, job);
    Bouns = bouns;
    Deductions = deductions;
    }
    public void setSalary(double salary)
    {
    Salary =salary;
    }
    @Override
    public double getSalary()
    {
    return Salary + Bouns - Deductions;
    }

//    public void setBouns(double Bouns) {
//        this.Bouns = Bouns;
//    }
//
//    public double getBouns() {
//        return Bouns;
//    }
//    
//    public void setDeductions(double Deductions) {
//        this.Deductions = Deductions;
//    }
//
//    public double getDeductions() {
//        return Deductions;
//    }
    
}   
