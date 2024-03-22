/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment6;

/**
 *
 * @author MASUD
 */
import java.util.Scanner;

public class Assignment6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) { // Odd terms are added
                sum += i * i;
            } else { // Even terms are subtracted
                sum -= i * i;
            }
        }

        System.out.println("The sum of the series is: " + sum);
    }
}
