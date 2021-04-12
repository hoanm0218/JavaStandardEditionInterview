package com.hoanm.java8.streamapi;

import com.sun.javafx.collections.ImmutableObservableList;
import jdk.nashorn.internal.ir.annotations.Immutable;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsExample {

    /**
     * Collectors:
     *      - toList()/toMap()/toSet()/toCollection(Collection::new): Convert to new collection
     *      - joining() : joining Stream<String> elements to one
     *      - summarizingDouble/Long/Int(): returns a special class containing statistical information in a Stream
     *      - summingDouble/Long/Int(): returns a sum of extracted elements
     *      - groupingBy(): grouping objects by some property and storing results in a Map instance.
     *      - maxBy()/minBy(): return max/min element
     */
    public static void main(String[] args) {

        List<String> givenList = Arrays.asList("a", "bb", "ccc", "dd");

        /**
         * Collectors.toList()
         *
         *  - ToList collector can be used for collecting all Stream elements into a List instance.
         */
        List<String> rsList = givenList.stream().collect(Collectors.toList());
        //Result List: [a, bb, ccc, dd]
        System.out.println("Result List: " + rsList);

        /**
         * Collectors.toSet()
         *
         *  - ToSet collector can be used for collecting all Stream elements into a Set instance.
         */
        Set<String> rsSet = givenList.stream().collect(Collectors.toSet());
        //Result Set: [bb, dd, a, ccc]
        System.out.println("Result Set: " + rsSet);

        /**
         * Collectors.toMap()
         *
         *  - toMap collector can be used to collect Stream elements into a Map instance.
         *  - To do this, we need to provide two functions:
         *      keyMapper
         *      valueMapper
         */
        Map<String, Integer> rsMap = givenList
                .stream().collect(Collectors.toMap(Function.identity(), String::length, (item, identicalItem) -> item));
        //Result Map: {dd=2, bb=2, a=1, ccc=3}
        System.out.println("Result Map: " + rsMap);

        /**
         * Collectors.toCollection()
         *
         *  - If you want to use a custom implementation, you will need to use the toCollection collector with a
         *  provided collection of your choice.
         */
        List<String> rsLinkedList = givenList.stream().collect(Collectors.toCollection(LinkedList::new));
        //Result rsLinkedList: [a, bb, ccc, dd]
        System.out.println("Result rsLinkedList: " + rsLinkedList);

        /**
         * Collectors.joining()
         *
         *  - Joining collector can be used for joining Stream<String> elements.
         */
        String rsJoining = givenList.stream().collect(Collectors.joining());
        //Result rsJoining: abbcccdd
        System.out.println("Result rsJoining: " + rsJoining);

        // You can also specify custom separators, prefixes, postfixes..
        String rsJoining1 = givenList.stream().collect(Collectors.joining(" "));
        //Result rsJoining1: a bb ccc dd

        // or you can write:
        String rsJoining2 = givenList.stream()
                .collect(Collectors.joining(" ", "PRE-", "-POST"));
        //Result rsJoining2: PRE-a bb ccc dd-POST

        /**
         * Collectors.summarizingDouble/Long/Int()
         *
         *  - SummarizingDouble/Long/Int is a collector that returns a special class containing statistical information
         *   about numerical data in a Stream of extracted elements.
         */
        DoubleSummaryStatistics rsSummarizingDouble = givenList.stream()
                .collect(Collectors.summarizingDouble(String::length));
        //DoubleSummaryStatistics{count=4, sum=8.000000, min=1.000000, average=2.000000, max=3.000000}

        /**
         * Collectors.summingDouble/Long/Int()
         *
         *  - SummingDouble/Long/Int is a collector that simply returns a sum of extracted elements.
         */
        Double rsSummingDouble = givenList.stream().collect(Collectors.summingDouble(String::length));
        //rsSummingDouble = 8.0

        /**
         * Collectors.maxBy()/minBy()
         *
         *  - MaxBy/MinBy collectors return the biggest/the smallest element of a Stream according to a provided
         *  Comparator instance
         */
        Optional<String> rsMaxBy = givenList.stream().collect(Collectors.maxBy(Comparator.naturalOrder()));
        System.out.println(rsMaxBy);

        /**
         * Collectors.groupingBy()
         *
         *  - GroupingBy collector is used for grouping objects by some property and storing results in a Map instance.
         */
        Map<Integer, Set<String>> result = givenList.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.toSet()));
        //{1=[a], 2=[bb, dd], 3=[ccc]}
    }
}







































