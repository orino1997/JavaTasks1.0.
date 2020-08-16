package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbsArray = new int[3];
        for (int i = 0; i < numbsArray.length; i++) {
            numbsArray[i] = Integer.parseInt(reader.readLine());
        }
        reader.close();

        double mean = 0;
        for (int j = 0; j < numbsArray.length; j++) {
            mean += numbsArray[j];
        }
        mean /= numbsArray.length;
        System.out.println(mean);

        int result = (int) (mean / 2);

        if (result > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
