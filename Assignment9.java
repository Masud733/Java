/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment9;

/**
 *
 * @author MASUD
 */
import java.util.Scanner;

public class Assignment9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int smallest, largest;
        double sum = 0;
        System.out.println("Enter five numbers:");
        
        smallest = scanner.nextInt();
        largest = smallest;

        for (int i = 1; i < 5; i++) {
            int num = scanner.nextInt();
            sum += num;
            smallest = Math.min(smallest, num);
            largest = Math.max(largest, num);
        }

        double average = sum / 5;

        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
        System.out.println("Average: " + average);
    }
}
