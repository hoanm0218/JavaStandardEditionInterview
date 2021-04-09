package com.hoanm.string.reversestring;

import java.util.Stack;

public class ReverseStringExample {

    public static void main(String[] args) {

        //Option 1:Swap String to byte
        String input1 = "UNI DEV";
        // getBytes() method to convert string
        // into bytes[].
        byte[] strAsByteArray = input1.getBytes();
        byte[] result = new byte[strAsByteArray.length];
        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        System.out.println(new String(result));

        //Option 2: Using reverse() method in StringBuilder/StringBuffer
        String input2 = "UNI DEV";
        StringBuilder stringBuilder = new StringBuilder(input2);
        System.out.println(stringBuilder.reverse().toString());

        //Option 3: Using Stack
        String input3 = "UNI DEV";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input3.length(); i++) {
            stack.push(input3.charAt(i));
        }
        StringBuilder stringBuilder1 = new StringBuilder();
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            stringBuilder1.append(stack.pop());
        }
        System.out.println(stringBuilder1.toString());
    }
}
