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
