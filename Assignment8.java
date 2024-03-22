/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment8;

/**
 *
 * @author MASUD
 */
public class Assignment8 {

    public static void main(String[] args) {
        int n = 10; 
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i * (2 * i + 1);
        }

        System.out.println("The sum of the series for n = " + n + " is: " + sum);
    }
}
