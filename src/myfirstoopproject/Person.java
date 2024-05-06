/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfirstoopproject;

/**
 *
 * @author Fathy
 */
public class Person {
    String Name;
    Double Age;
    String Address;
    String Notionaliy;
    public Person(){}
    public Person(String name,Double age,String address,String notionaliy)
    {
    Name = name;
    Age = age;
    Address = address;
    Notionaliy=notionaliy;
    }
    public void setName(String name)
    {
    Name = name;
    }
    public String getName()
    {
    return Name;
    }
    public void setAge(Double age)
    {
    Age = age;
    }
    public Double getAge()
    {
    return Age;
    }
    public void setAddress(String address)
    {
    Address = address;
    }
    public String getAddress()
    {
    return Address;
    }
    public void setNotionaliy(String notionaliy)
    {
    Notionaliy = notionaliy;
    }
    public String getNotionaliy()
    {
    return Notionaliy;
    }
    public void print_All_Datalis()
    {
    System.out.println("Name = " +Name+"\n Age = " +Age+ "\n Address = " +Address+ "\n Notionaliy = " +Notionaliy);
    }
    
}
