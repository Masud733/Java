/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.staticmethod;

/**
 *
 * @author MASUD
 */
public class Staticmethod {
    String name;
    int id;
    static String University = "North South";
Staticmethod(String n, int i){
    name = n;
    id = i;
}
void display(){
    System.out.println("Non static method.");
    System.out.println("\nName="+name+"\nId="+id);
    //display();//static method
    System.out.println("University_Name="+University);
}static void display1(){
    System.out.println("Static method1");
            //display2()//static method
}
static void display2(){
    System.out.println("Static method2");
    University ="TU Delft";
    
}
}
//Test class
public class NewClass {
    public static void main(String[] args){
        Staticmethod obj = new Staticmethod("Masud Mehrab", 120733);
        obj.display();
        Staticmethod.display1();
        System.out.println(Staticmethod.University);
        Staticmethod.display2();
        System.out.println(Staticmethod.University);
        
    }
    
}
