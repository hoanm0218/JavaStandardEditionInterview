package com.hoanm.java8.streamapi.operation.teminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MinMaxMethodExample {

    public static void main(String[] args) {
        //Find max, min with Class Object
        List<Programing> programingList = new ArrayList<>();
        programingList.add(new Programing("Java", 2));
        programingList.add(new Programing("C#", 1));
        programingList.add(new Programing("C++", 5));
        programingList.add(new Programing("PHP", 4));

        //max exp = 5
        Programing programingMaxExp = programingList.stream().max(Comparator.comparing(Programing::getExp)).get();
        //Min exp = 1
        Programing programingMinExp = programingList.stream().min(Comparator.comparing(Programing::getExp)).get();


        Integer[] numbers = {1, 8, 3, 4, 5, 7, 9, 6};
        // Find max, min with Array ====================

        // Max = 9
        Integer maxNumber = Stream.of(numbers)
                .max(Comparator.comparing(Integer::valueOf))
                .get();

        // Min = 1
        Integer minNumber = Stream.of(numbers)
                .min(Comparator.comparing(Integer::valueOf))
                .get();

        // Find max, min with Collection ====================
        List<Integer> listOfIntegers = Arrays.asList(numbers);

        // Max = 9
        Integer max = listOfIntegers.stream()
                .mapToInt(v -> v)
                .max()
                .getAsInt();

        // Min = 1
        Integer min = listOfIntegers.stream()
                .mapToInt(v -> v)
                .min()
                .getAsInt();
    }
}

class Programing {
    private String subject;
    private int exp;

    public Programing(String subject, int exp) {
        this.subject = subject;
        this.exp = exp;
    }

    public Programing() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return exp + " - " + subject;
    }
}