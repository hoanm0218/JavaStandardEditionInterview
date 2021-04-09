package com.hoanm.practice;

public class Print1To100WithoutAnyNumberExample {

    /**
     * Print from 1 to 100 without using any numbers in your code
     * Get number from:
     * - index character in ASCII code
     * - value return from method length() in String class
     * Print using:
     * - for loop
     * - while loop
     * - do-while loop
     */

    static int first = 'A' / 'A'; // 1
    //ASCII code: a-97 b-98 c-99 d-100
    static int last1 = 'd'; // 100
    static String str = "**********";  //10 characters
    static int last2 = str.length() * str.length(); //100

    public static void main(String[] args) {

        //  Option 1: for loop
        System.out.println("Using for loop:");
        for (int i = first; i <= last1; i++) {
            System.out.println(i);
        }

        //  Option 2: while loop
        System.out.println("Using while loop:");
        while (first <= last2) {
            System.out.println(first);
            first++;
        }
        first = 'A' / 'A';

        //  Option 3: do-while loop
        System.out.println("Using do-while loop:");
        do {
            System.out.println(first);
            first++;
        } while (first <= last2);
        first = 'A' / 'A';

        //  Option 4: recursive
        System.out.println("Using Recursive:");
        printNumber(first);
    }

    static void printNumber(int i) {
        if (first <= last2) {
            System.out.println(first);
            first++;
            printNumber(first);
        }
    }
}
