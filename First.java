/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.first;

/**
 *
 * @author MASUD
 */

    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


/**
 *
 * @author MASUD
 */
public class First {
    String name;
    int age;
    int weight;
    void display1(){
        System.out.println("Parent class");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Weight: "+weight);
    }
    void doit(){
        System.out.println("Doing nothing");   
    }
   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.first;

/**
 *
 * @author MASUD
 */
//public class Student {
    public class Student extends First{
    int id;
    String section;
    
    void display2(){
        System.out.println("Child Class");
        doit();      
    } 
    @Override
    void display1(){
        super.display1();
        System.out.println("Id:"+id);
        System.out.println("Section:"+section);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.first;

/**
 *
 * @author MASUD
 */
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Mehrab";
        s1.age = 22;
        s1.id = 733;
        s1.section = "4B";
        s1.weight = 68;
        
        s1.display2();
        System.out.println("--------------");
        s1.display1();
        System.out.println("--------------");
        s1.doit();
        
        
    }
    }
    


    


