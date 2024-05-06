/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfirstoopproject;

/**
 *
 * @author Fathy
 */
public class Employee2 extends Person{
    double Salary;
    String Rank;
    String Job;

    public Employee2() 
    {
    }

    public Employee2(String name, Double age, String address, String notionaliy,double salary,String rank,String job) 
    {
        super(name, age, address, notionaliy);
        Salary =salary;
        Rank = rank;
        Job = job;
        
    }
    public void setSalary(double salary)
    {
    Salary = salary;
    }
    public double getSalary()
    {
    return Salary;
    }
    public void setRank(String rank)
    {
    Rank = rank;
    }
    public String getRank()
    {
    return Rank;
    }
    public void setJob(String job)
    {
    Job = job;
    }
    public String getJob()
    {
    return Job;
    }
@Override
public void print_All_Datalis()
{
super.print_All_Datalis();
System.out.println("Salary = " +Salary+ "\n Rank = " +Rank+ "\n Job = " +Job);
}
}
