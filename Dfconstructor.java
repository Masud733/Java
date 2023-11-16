/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dfconstructor;

/**
 *
 * @author MASUD
 */
public class Dfconstructor {
    String name, gender;
    int age;

    Dfconstructor(){
        System.out.println("Default Constructor");
    }
}
//Test class
public class DfClass {
    public static void main(String[] args){
        System.out.println("Hello World!");
        Dfconstructor df = new Dfconstructor();
        df.name = "Masud Mehrab";
        df.gender = "Male";
        df.age = 22;
        System.out.println("\nName:"+df.name+"\nGender:"+df.gender+"\nAge:"+df.age);
        
    }
    
}

