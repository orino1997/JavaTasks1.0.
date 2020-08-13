package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        reader.close();

        System.out.println(binaryTooDecimal(stringToNumbs(input)));
    }

    public static int[] stringToNumbs(String s) {
        int[] numbsArray = new int[s.length()];
        String[] stringArray = s.split("");
        for (int i = 0; i < numbsArray.length; i++) {
            numbsArray[i] = Integer.parseInt(stringArray[i]);
        }
        return numbsArray;
    }

    public static int binaryTooDecimal(int[] arr) {
        int result = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            int a = arr[i];
            int index = arr.length - 1 - i;
            double c = a * Math.pow(2, index);
            result += c;
        }
        return result;
    }
}
