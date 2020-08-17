package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinalTask2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Determine a size of your array:");

        int size = Integer.parseInt(reader.readLine());
        if (size < 1) {
            System.out.println("Type any number larger than 0");
        } else {
            System.out.println("Type the content of your array");
            int[] inputArray = new int[size];
            for (int i = 0; i < size; i++) {
                inputArray[i] = Integer.parseInt(reader.readLine());
            }
            selectionSort(inputArray);
            for (int number : inputArray) {
                System.out.println(number);
            }
        }
        reader.close();
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    minIndex = j;
                    min = array[j];
                }
            }
            array[minIndex] = array[i];
            array[i] = min;
        }
    }
}
