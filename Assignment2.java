/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment2;

/**
 *
 * @author MASUD
 */
public class Assignment2 {


    public static int factorial(int n) {
        if (n == 0) {  // Base case: factorial of 0 is 1
            return 1;
        } else {
            return n * factorial(n - 1);  // Recursive call
        }
    }

    public static void main(String[] args) {
        int num = 5;
        int result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }
}


