/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment3;

/**
 *
 * @author MASUD
 */


import java.util.Scanner;

public class Assignment3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hourly wage: ");
        double hourlyWage = scanner.nextDouble();

        System.out.print("Enter total regular hours: ");
        double regularHours = scanner.nextDouble();

        System.out.print("Enter total overtime hours: ");
        double overtimeHours = scanner.nextDouble();

        double regularPay = hourlyWage * regularHours;
        double overtimePay = hourlyWage * 1.5 * overtimeHours;
        double totalWeeklyPay = regularPay + overtimePay;

        System.out.println("Total weekly pay: " + totalWeeklyPay);
    }
}
