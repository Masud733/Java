/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prconstructor;

/**
 *
 * @author MASUD
 */
public class Prconstructor {
    String name, gender;
    int age;
    
    Prconstructor(String n, String s, int a){
        name = n;
        gender = s;
        age = a;
    }
}

//Test class
public class TestClass {
    public static void main(String[] args){
        System.out.println("Hello World!");
        Prconstructor pr = new Prconstructor("Masud","Male",22);
        System.out.println("\nname:"+pr.name+"\nage:"+pr.age+"\nGender:"+pr.gender);
    }
           
    
}

