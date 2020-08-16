package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task15 {
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

            for (int i = inputArray.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (inputArray[j] > inputArray[j + 1]) {
                        int tmp = inputArray[j];
                        inputArray[j] = inputArray[j + 1];
                        inputArray[j + 1] = tmp;
                    }
                }
            }
            for(int finalNumber : inputArray) {
                System.out.println(finalNumber);
            }
        }

        reader.close();
    }
}
