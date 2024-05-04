/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfirstoopproject;

/**
 *
 * @author Fathy
 */
public class Employee {
    int Emp_id;
    String Ename;
    String Depart;
    double Salary;
    double Bonus;
    boolean Resident;
    public Employee()
    {
    Emp_id=100;
    Ename="Fathey Osama";
    Depart="No Assigned yet";
    Salary=30000;
    Bonus=5000;
    Resident=true;
    }
    public Employee(int empiD,String ename)
    {
    Emp_id=empiD;
    Ename=ename;
    }
    public Employee(int empiD,String ename,boolean resident)
    {
    this(empiD,ename);
    Resident=resident;
    }
    public Employee(int empiD,String ename,boolean resident,String depart,double salary,double bonus )
    {
    this(empiD,ename,resident);
    Depart=depart;
    Salary=salary;
    Bonus=bonus;
    }
    
    public void Print_emp_data()
{
    System.out.println("ID {"+Emp_id+"}");
    System.out.println("Ename {"+Ename+"}");
    System.out.println("Depart {"+Depart+"}");
    System.out.println("Salary {"+Salary+"}");
    System.out.println("Bouns {"+Bonus+"}");
    System.out.println("resident {"+Resident+"}");    
}


}
