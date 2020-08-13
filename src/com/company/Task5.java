package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        reader.close();

        long numericInput = Long.parseLong(input);
        System.out.printf("%s * 0 = %d\n", input, 0);
        System.out.printf("%s * 1 = %d\n", input, numericInput);
        System.out.printf("%s * 2 = %d\n", input, numericInput * 2);
        System.out.printf("%s * 3 = %d\n", input, numericInput * 3);
        System.out.printf("%s * 4 = %d\n", input, numericInput * 4);
        System.out.printf("%s * 5 = %d\n", input, numericInput * 5);
        System.out.printf("%s * 6 = %d\n", input, numericInput * 6);
        System.out.printf("%s * 7 = %d\n", input, numericInput * 7);
        System.out.printf("%s * 8 = %d\n", input, numericInput * 8);
        System.out.printf("%s * 9 = %d\n", input, numericInput * 9);
        System.out.printf("%s * 10 = %d\n", input, numericInput * 10);
    }
}
