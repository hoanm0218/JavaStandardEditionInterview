package com.hoanm.practice;

public class StarPatternExample {

    public static void main(String[] args) {

        /**
         * 1. Print star pattern
         *      *
         *      **
         *      ***
         *      ****
         */
        System.out.println("First pattern: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        /**
         * 2. Print star pattern
         *      ****
         *      ***
         *      **
         *      *
         */
        System.out.println("Second pattern: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        /**
         * 3. Print star pattern
         *      *
         *      **
         *      ***
         *      ****
         *      ***
         *      **
         *      *
         */
        System.out.println("Third pattern: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j > i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        /**
         * 4. Print star pattern
         *          *
         *         **
         *        ***
         *       ****
         */
        System.out.println("Fourth pattern: ");
        for (int i= 0; i < 4; i++){
            for (int j= 3; j > i; j--){
                System.out.print(" ");
            }
            for (int k = 0; k <=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
