package com.hoanm.practice;

import org.apache.commons.lang3.StringUtils;

public class CountOccurrencesOfStringExample {

    /**
     * How to count the occurrences character of String
     * 1. charArray for loop
     * 2. string.length -- charAt(character)
     * 3. Apache Common StringUtils //Option 2
     * 4. Stream API
     */

    public static void main(String[] args) {

        System.out.println(countOccurrenceCharOption1("UNIDEVD", 'D'));
        System.out.println(countOccurrenceCharOption2("UNIDEVD", 'D'));
        System.out.println(countOccurrenceCharOption3("UNIDEVD", 'D'));
        System.out.println(countOccurrenceCharOption4("UNIDEVD", 'D'));
    }

    //  1. charArray for loop
    public static int countOccurrenceCharOption1(String inputStr, Character inputChar) {

        int count = 0;
        char[] chars = inputStr.toCharArray();
        for (Character character : chars) {
            if (character.equals(inputChar)) {
                count++;
            }
        }
        return count;
    }

    //  2. string.length -- charAt(character)
    public static int countOccurrenceCharOption2(String inputStr, Character inputChar) {

        int count = 0;
        for (int i = 0; i < inputStr.length(); i++) {
            //if (inputChar == (inputStr.charAt(i)) {
            if (inputChar.equals(inputStr.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    // 3. Apache Common StringUtils
    public static int countOccurrenceCharOption3(String inputStr, Character inputChar) {

        int count = 0;
        count = StringUtils.countMatches(inputStr, inputChar);
        return count;
    }

    // 4. Stream API
    public static long countOccurrenceCharOption4(String inputStr, Character inputChar) {

        long count = 0;
        count = inputStr.chars()
                .mapToObj(value -> (char) value)
                .filter(s -> s.equals(inputChar))
                .count();
        return count;
    }

}
