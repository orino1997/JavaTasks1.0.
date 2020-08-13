package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Determine a size of your array. Type two numbers");
        int matrixY = Integer.parseInt(reader.readLine());
        int matrixX = Integer.parseInt(reader.readLine());
        int[][] inputArray = new int[matrixY][matrixX];

        if (matrixY < 1 || matrixX < 1) {
            System.out.println("Type any number larger than 0");
        } else {
            System.out.println("Type the content of your array");
            inputArray = new int[matrixY][matrixX];
            for (int i = 0; i < matrixY; i++) {
                for (int j = 0; j < matrixX; j++) {
                    inputArray[i][j] = Integer.parseInt(reader.readLine());
                }
            }
        }

        for (int i = 0; i < matrixY; i++) {
            for (int j = 0; j < matrixX; j++) {
                System.out.print(inputArray[i][j] * 3 + " ");
            }
            System.out.println("\n");
        }
        reader.close();
    }
}
