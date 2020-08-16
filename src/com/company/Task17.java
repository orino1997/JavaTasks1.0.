package com.company;

import java.io.*;

public class Task17 {
    public static void main(String[] args) throws IOException {
        File file = new File("resource\\fileForWriting.txt");
        FileWriter fileWriter = new FileWriter(file);
        String stop = "stop";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type lines you want to be written. If you want to break the process - type \"stop\"");
        String input = reader.readLine();
        while (!input.equals(stop)) {
            fileWriter.write(input + "\n");
            input = reader.readLine();
        }
        reader.close();
        fileWriter.close();
    }
}
