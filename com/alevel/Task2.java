package com.alevel;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        double[][] twoDimensionalArray = new double[10][10];
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                twoDimensionalArray[i][j] = Math.floor(Math.random() * 10);
            }
        }

        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = i; j < twoDimensionalArray[i].length; j++) {
                double c = twoDimensionalArray[i][j];
                twoDimensionalArray[i][j] = twoDimensionalArray[j][i];
                twoDimensionalArray[j][i] = c;
            }
        }
    }
}
