/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment4;

/**
 *
 * @author MASUD
 */
public class Assignment4{

    public static void insertionSort(int[] array) {
        int n = array.length;

        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1;

            while (i >= 0 && array[i] > key) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 14, 3, 2, 43, 11, 58, 22};

        System.out.println("Random numbers:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        insertionSort(arr);

        System.out.println("\nAfter Insertion Sort:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
