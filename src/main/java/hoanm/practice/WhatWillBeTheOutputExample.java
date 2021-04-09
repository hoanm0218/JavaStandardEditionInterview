package hoanm.practice;

public class WhatWillBeTheOutputExample {

    /**
     * What will be the output when you print this:
     * (byte) + (char) - (int) + (long) - 1?
     */

    public static void main(String[] args) {

        int i = (byte) +(char) -(int) +(long) -1;
        int j = (int) +(long) -1;
        System.out.println(i);
        System.out.println(j);

    }
}
