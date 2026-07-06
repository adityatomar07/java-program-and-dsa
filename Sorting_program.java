package Sorting;

import java.util.Arrays;
//import java.util.Collections;
//import java.util.Scanner;

//this is for bubble sort array :---
public class Sorting_program {
    public static void bubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // this is for Selection sort Arary :--
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;

                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    // this is for Insertion Sort :---
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // while loop for findout correct position to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // this is for insertion
            arr[prev + 1] = curr;

        }
    }

    // this is for Counting sorting :--
    public static void countingArr(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);

        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // sorting method
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        /*
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Enter the size of Arary : ");
         * int n = sc.nextInt();
         * Integer arr[] = new Integer[n];
         * System.out.println("Enter the Elements of Array : ");
         * for (int i = 0; i < n; i++) {
         * arr[i] = sc.nextInt();
         * }
         * System.out.print("Sorted Array : ");/*
         */

        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        // countingArr(arr);
        Arrays.sort(arr);
        // for reverse sorting through inbuilt techinique
        // Arrays.sort(arr, Collections.reverseOrder()); when we used this method then
        // remove comment here and upper(where pacakages is write.)
        printArr(arr);
        // sc.close();
    }
}
