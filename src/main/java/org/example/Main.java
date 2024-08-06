package org.example;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // Defining an array
        System.out.println(average(numbers)); // Check if the method works | Expected output = 3.0

        // Introduce a null pointer exception
        int[] nullArray = null;
        try {
//            System.out.println(average(nullArray)); // This will throw a NullPointerException used a breakpoint to pass this before comment out
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }

        // Introduce an array index out of bounds exception
        try { // Asking for an index in the array
//            System.out.println(numbers[5]); // This will throw an ArrayIndexOutOfBoundsException used debug to try different index values
            System.out.println(numbers[4]); // This will work
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static double average(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array is null or empty.");
        }

        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
//        return sum / (numbers.length + 1); // This is wrong logic
        return sum / numbers.length; // Return the sum divided by the length to get an average
    }
}