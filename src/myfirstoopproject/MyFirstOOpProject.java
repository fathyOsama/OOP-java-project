/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myfirstoopproject;
import java.util.Scanner;
/**
 *
 * @author Fathy
 */
public class MyFirstOOpProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rectangle room3=new Rectangle();
        Rectangle MyInputObject=new Rectangle(10,30);
        
        room3.ModifyObject(MyInputObject);
        System.out.println(MyInputObject.getLength());
        System.out.println(MyInputObject.getWidth());
        
        
       /* 
        Rectangle r1=new Rectangle();
        double roomlength=40;
        r1.setLength(roomlength);
       System.out.println(roomlength);
        */
        /*
        System.out.println(Calc.add(20, 50));
        System.out.println(Calc.multiply(2, 4));
        */
       /*
        Employee E1=new Employee();
        E1.Print_emp_data();
        
        System.out.println("=========================");
        Employee E2=new Employee(80000,"Fathey");
        E2.Print_emp_data();

          System.out.println("=========================");
        Employee E3=new Employee(65000,"Osama",false);
        E3.Print_emp_data();
        
           System.out.println("=========================");
           
         //  Employee E4=new Employee(500,"FaTHEY osama fathey",true,"Accounting",75000,5000);
         Employee E4=new Employee(500,"Fathey Osama Fathey",false,"Accounting",70500,5000 );
         E4.Print_emp_data();
          */
        /*
        Car car1=new Car();
        System.out.println("this is it Maker ");
        System.out.println("{"+car1.getMaker()+"}");
        System.out.println("this is it Model ");
        System.out.println("{"+car1.getModel()+"}");
        System.out.println("this is it Cece ");
        System.out.println("{"+car1.getCece()+"}");
        System.out.println("this is it caler");
        System.out.println("{"+car1.getColor()+"}");
        
        System.out.println("====================");
        
        Car car2=new Car("Honda",2019,2000,"Bleak");
        System.out.println("this is it Maker ");
        System.out.println("{"+car2.getMaker()+"}");
        System.out.println("this is it Model ");
        System.out.println("{"+car2.getModel()+"}");
        System.out.println("this is it Cece ");
        System.out.println("{"+car2.getCece()+"}");
        System.out.println("this is it caler");
        System.out.println("{"+car2.getColor()+"}");
/*
        // TODO code application logic here
        //System.out.println("welcame fathey");
        //System.out.println("hello");
//        Rectangle c1=new Rectangle();
//        c1.setLength(21.5);
//        c1.setWidth(14.2);
//       c1.print();
//Scanner outpot=new Scanner(System.in);
   /*  Car Car1=new Car();
     Car1.setMaker("{ Toyota }");
     Car1.setModel("{ 2011 }");
     Car1.setCece("{ 1600 }");
     Car1.setCaler("{ red }");
    // c1.print();
    System.out.println("this is it Maker ");
    System.out.println(Car1.getMaker());
    System.out.println("this is it Model ");
    System.out.println(Car1.getModel());
    System.out.println("this is it Cece ");
    System.out.println(Car1.getCece());
    System.out.println("this is it caler");
    System.out.println(Car1.getCaler());
    System.out.println("====================");
    Car Car2=new Car();
    Car2.setMaker("{ honda }");
    Car2.setModel("{ 2018 }");
    Car2.setCece("{ 2000 }");
    Car2.setCaler("{ blaek }");
    
    System.out.println("this is Maker ");
    System.out.println(Car2.getMaker());
    System.out.println("this is Model ");
    System.out.println(Car2.getModel());
    System.out.println("this is Cece ");
    System.out.println(Car2.getCece());
    System.out.println("this is caler");
    System.out.println(Car2.getCaler());*/


    }
    
}
