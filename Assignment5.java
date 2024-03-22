/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment5;

/**
 *
 * @author MASUD
 */
public class Assignment5 {

    public static void main(String[] args) {
        int num = 153;  // Replace with the number you want to check
        int originalNum = num;
        int result = 0;
        int remainder;

        // Count the number of digits
        int digits = 0;
        while (originalNum != 0) {
            originalNum /= 10;
            digits++;
        }

        // Calculate the sum of each digit raised to the power of the number of digits
        originalNum = num;
        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, digits);
            originalNum /= 10;
        }

        // Check if the sum is equal to the original number
        if (result == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
