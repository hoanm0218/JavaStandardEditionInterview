package com.hoanm.array;

import org.apache.commons.lang3.stream.Streams;

import java.util.stream.IntStream;

public class ArrayTestExample {

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < s.length; i++){
            sb.append(s[i]);
        }
        sb.reverse();
        String str = sb.toString();
        char[] rs = str.toCharArray();
        s = rs;
        System.out.println(s);

    }
}
