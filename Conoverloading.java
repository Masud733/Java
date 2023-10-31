/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conoverloading;

/**
 *
 * @author MASUD
 */
public class Conoverloading {
    String name, gender;
    int age, weight;
    
    Conoverloading(){
        System.out.println("Default constructor!");
    }
    Conoverloading(String n, String g, int a){
        name = n;
        gender = g;
        age = a;
    } 
     Conoverloading(String n, String g, int a, int w){
        name = n;
        gender = g;
        age = a;
        weight = w;
    }   
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
//Test class
public class ConoverClass {
    public static void main(String[] args){
        Conoverloading con1 = new Conoverloading("Masud Mehrab", "Male", 22);
        Conoverloading con2 = new Conoverloading("Azizul Haque Taushif", "Male", 25, 70);
        Conoverloading con3 = new Conoverloading();
        
        System.out.println("\nName: "+con1.name+"\nAge: "+con1.age+"\nGender: "+con1.gender);
        System.out.println("\nName: "+con2.name+"\nAge: "+con2.age+"\nGender: "+con2.gender+"\nWeight: "+con2.weight);
    }
        
    
}
