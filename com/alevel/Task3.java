package com.alevel;

public class Task3 {
    public static void main(String[] args) {
        double[] array = {1, 5, 235, 6, 7, 27124, 235, 124, 45235, 235, 12, 14, 1234, 234, 432, 142, 412, 4, 4, 3, 234, 234};

        for (int i = 0; i < array.length; i++) {
            double min = array[i];
            int position = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    position = j;
                }
            }
            array[position] = array[i];
            array[i] = min;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
