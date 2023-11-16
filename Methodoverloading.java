/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.methodoverloading.java;

/**
 *
 * @author MASUD
 */
public class MethodoverloadingJava {
    public int add(int a, int b){
        return a+b;  
    }
    public int add(int a, int b,int c){
        return a+b+c; 
    }
     public double add(double a, double b){
        return a+b;  
    }
    public double div(double x, double y){
        return x/y;
    }
    public String add(String st1, String st2){
        return st1+st2;  
    }
    
    public static void main(String[] args) {
        MethodoverloadingJava obj = new MethodoverloadingJava();
        // Call the methods with different arguments
        System.out.println("Sum of two integers: "+obj.add(5,10D));
        System.out.println("Sum of three integers: "+obj.add(5,10,15));
        System.out.println("Sum of two doubles : "+obj.add(5.5,10.5));
        System.out.println("Division of two doubles: "+obj.div(5.5,3.5));
        System.out.println("Sum of two strings: "+obj.add("Hello ","Java"));
        
       
    }
}
