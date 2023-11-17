/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.campus;

/**
 *
 * @author MASUD
 */
public class Campus {
String name;
int id;
static String University = "NUBTK";
    
Campus(String n, int i){
        name= n;
        id = i;
    
}
void display(){
    System.out.println("Name: "+name);
    System.out.println("Id: "+id);
}
}
public class Classcampus {
    public static void main(String[] args){
        Campus p = new Campus("Masud", 1023330);
        p.display();
        System.out.println("University name: "+Campus.University);
    }
    
}


    
