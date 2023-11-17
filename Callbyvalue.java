/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.callbyvalue;

/**
 *
 * @author MASUD
 */
public class Callbyvalue {

    void change(int i){
        i=20; 
    }
}
public class Classcallbyvalue {
    public static void main(String[] args){
        Callbyvalue vl = new Callbyvalue();
        int x= 10;
        System.out.println("Befor call= "+x);
        vl.change(x);
        System.out.println("After call= "+x);
        
    }
    
}

