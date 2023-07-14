package org.example;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 5, 2, 4, 8, 6, 4, 6, 8, 10, 9, 9, 10, 3};

        int[] elements = new int[array.length];
        int[] frequencies = new int[array.length];

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            boolean found = false;

            for (int j = 0; j < count; j++) {
                if (elements[j] == element) {
                    frequencies[j]++;
                    found = true;
                    break;
                }
            }

            if (!found) {
                elements[count] = element;
                frequencies[count] = 1;
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.println(elements[i] + " : " + frequencies[i]);
        }
    }
}