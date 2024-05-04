/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfirstoopproject;

/**
 *
 * @author Fathy
 */
public class Rectangle {
    private double Length;
    private double Width;
    public Rectangle()
    {
    Length=30;
    Width=20;
    }
    public Rectangle(double l,double w)
    {
        Length=l;
        Width=w;
    }
    public void setLength(double l)
    {
        l=60;
    Length=l;
    }
    public void setWidth(double w)
    {
    Width=w;
    }
    public void ModifyObject(Rectangle r)
    {
    r.Length=47;
    r.Width=77;
    }
    public double getLength()
    {
    return Length;
    }
    public double getWidth()
    {
    return Width;
    }
    public double getArea()
    {
    return Length*Width;
    }
    public void print()
    {
     System.out.println(getLength());
        System.out.println(getWidth());
        System.out.println("multplying Length in Width ==Alea");
          System.out.println(getArea());
    }
}
