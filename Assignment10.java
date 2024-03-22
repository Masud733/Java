/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment10;

/**
 *
 * @author MASUD
 */
public class  {

    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 8, 2};

        // Bubble sort implementation for simplicity
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // After sorting, the first element is the minimum and the last element is the maximum
        int minValue = arr[0];
        int maxValue = arr[arr.length - 1];

        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));  // Using Arrays.toString() for clarity
        System.out.println("Minimum value: " + minValue);
        System.out.println("Maximum value: " + maxValue);
    }
}