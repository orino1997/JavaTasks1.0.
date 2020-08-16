package com.company;

import java.io.*;

public class Task18 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        File file = new File("resource\\fileForReadingAndWriting.txt");
        int numberOfLines;

        char[] content = new char[(int) file.length()];
        try {
            fileReader = new FileReader(file);
            fileReader.read(content);
        } catch (IOException e) {
            System.out.println("Input - output exception " + e);
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }
        String dataFromFile = new String(content);
        String[] temp = dataFromFile.split("\n");
        numberOfLines = temp.length;

        System.out.println("Type new data for your file");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileWriter writer = new FileWriter(file, false);

        String newData = "";
        for (int i = 0; i < numberOfLines; i++) {
            newData += reader.readLine();
            if (i != numberOfLines - 1) {
                newData += "\n";
            }
        }
        writer.write(newData);

        reader.close();
        writer.close();

    }
}
