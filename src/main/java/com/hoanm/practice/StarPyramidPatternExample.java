package com.hoanm.practice;

public class StarPyramidPatternExample {

    public static void main(String[] args) {

        /**
         *  Print star pyramid pattern
         *            *
         *           * *
         *          * * *
         *         * * * *
         */
        System.out.println("Star pyramid pattern:");
        for (int i = 1; i <= 4; i++) {
            for (int j = 3; j >= i ; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
                //System.out.print(" *");
            }
            System.out.println();
        }

    }
}
