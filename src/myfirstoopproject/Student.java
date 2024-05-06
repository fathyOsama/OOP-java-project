/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfirstoopproject;

/**
 *
 * @author Fathy
 */
public class Student extends Person {
    int StudyLevel;
    String Specialization;
    Double Gpa;

    public Student() {
    }

    public Student(String name, Double age, String address, String notionaliy,int studylevel,String specialization,double gpa  ) {
        super(name, age, address, notionaliy);
        StudyLevel = studylevel;
        Specialization =specialization;
        Gpa =gpa;
       }
public void setStudyLevel(int studylevel)
{
this.StudyLevel = studylevel;
}
public int getStudyLevel()
{
return StudyLevel;
}
public void setSpecialization(String specialization)
{
this.Specialization = specialization;
}
public String getSpecialization() 
{
return Specialization;
}
public void setGpa(Double Gpa)
{
this.Gpa = Gpa;
}
public Double getGpa()
{
return Gpa;
}

}
