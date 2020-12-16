package com.alevel;

public class Task1 {
    public static void main(String[] args) {
        double[] array = {1, 5, 235, 6, 7, 27124, 235, 124, 45235, 235, 12, 14, 1234, 234, 432, 142, 412, 4, 4, 3, 234, 234};
        int count = 0;
        double number = 0;
        for (int i = 0; i < array.length; i++) {
            int tempCount = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    tempCount++;
                }
            }
            if (count < tempCount) {
                count = tempCount;
                number = array[i];
            } else if (count == tempCount) {
                if (number > array[i]) {
                    number = array[i];
                }
            }
        }
        System.out.println("Number \"" + number + "\" is repeated " + count + " times.");
    }
}
