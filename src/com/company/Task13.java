package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task13 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = reader.readLine();
        String secondLine = reader.readLine();
        if (firstLine.length() == secondLine.length()) {
            System.out.println("Lines are equal in length");
        } else if (firstLine.length() > secondLine.length()) {
            System.out.printf("The longest line is \"%s\" \n", firstLine);
        } else {
            System.out.printf("The longest line is \"%s\" \n", secondLine);
        }
        reader.close();
    }
}
