package hoanm.practice;

import java.util.HashMap;
import java.util.Map;

public class CountOfDuplicateCharOfStringExample {

    /**
     * How to print count of duplicate characters in String
     */
    public static void main(String[] args) {

        countOfDuplicate(null);
        countOfDuplicate("");
        countOfDuplicate(" ");
        countOfDuplicate("not dup");
        countOfDuplicate("UNIUNU");

    }

    public static void countOfDuplicate(String inputString) {

        if (inputString == null) {
            System.out.println("NULL String");
        } else if (inputString.isEmpty()) {
            System.out.println("Empty String");
        } else if (inputString.length() == 1) {
            System.out.println("Single Char String");
        } else {
            char[] words = inputString.toCharArray();
            Map<Character, Integer> mapChar = new HashMap<>();
            for (Character c : words) {
                if (mapChar.containsKey(c)) {
                    mapChar.put(c, (mapChar.get(c) + 1));
                } else {
                    mapChar.put(c, 1);
                }
            }
            int count = 0;
            for (Map.Entry<Character, Integer> entry : mapChar.entrySet()) {
                if (entry.getValue() > 1) {
                    System.out.println(entry.getKey() + " : " + entry.getValue());
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Have not char duplicate in String: " + inputString);
            }
        }
    }
}
