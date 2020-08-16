package com.company;

import java.io.*;

public class Task16 {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        File file = new File("resource\\file.txt");
        char[] content = new char[(int) file.length()];
        try {
            reader = new FileReader(file);
            reader.read(content);
        } catch (IOException e) {
            System.out.println("Input - output exception " + e);
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
        System.out.println(String.valueOf(content));
    }
}
