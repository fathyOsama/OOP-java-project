/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfirstoopproject;

/**
 *
 * @author Fathy
 */
public class Car {
    private String Maker;
    private int Model;
    private int Cece;
    private String Color;
    
    public Car()
    {
    Maker="Toyota";
    Model=2018;
    Cece=1800;
    Color="white";
    }
    public Car(String mak,int mod,int ce,String cal)
    {
    Maker=mak;
    Model=mod;
    Cece=ce;
    Color=cal;
    }
    public void setMaker(String mak)
    {
        Maker=mak;   
    }
    public void setModel(int mod)
    {
         Model= mod;
    }
    public void setCece(int ce)
    {
    Cece=ce;
    }
    public void setColor(String cal)
    {
    Color=cal;
    }
    public String getMaker()
    {
    return Maker;
    }
    public int getModel()
    {
    return Model;
    }
    public int getCece()
    {
    return Cece;
    }    
    public String getColor()
    {
    return Color;
    }
    public void print()
    {
    System.out.println(Maker);
    System.out.println(Model);
    System.out.println(Cece);
    System.out.println(Color);
    }
}
