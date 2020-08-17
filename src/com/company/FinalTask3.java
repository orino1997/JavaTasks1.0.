package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class FinalTask3 {
    public static void main(String[] args) throws IOException {
        System.out.println("Type current exchange rate USD to RUB");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Double exchangeRate = Double.parseDouble(reader.readLine());

        System.out.println("Type how many rubles, you want to convert");
        Double rubles = Double.parseDouble(reader.readLine());
        reader.close();

        double result = rubles / exchangeRate;
        BigDecimal bd = new BigDecimal(Double.toString(result));
        System.out.println(bd.setScale(2, RoundingMode.HALF_UP));
    }
}
