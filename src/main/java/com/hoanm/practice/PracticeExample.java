package com.hoanm.practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PracticeExample {

    public static void main(String[] args) {

        //  1. List to maap
        Map<String, Person> map = convertListToMap();
        map.forEach((s, person) -> System.out.println(person.toString()));


    }

    //  1. List to Map
    static Map<String, Person> convertListToMap(){

        List<Person> list = new ArrayList<>();
        list.add(new Person("Uni1" , "HCM"));
        list.add(new Person("Uni2" , "HCM"));
        list.add(new Person("Uni3" , "HCM"));
        list.add(new Person("Uni4" , "HCM"));
        list.add(new Person("Uni1" , "DL"));

        Map<String, Person> map = list.stream()
                .collect(Collectors.toMap(Person::getName, Function.identity(), (oldName, newName) -> oldName));
        return map;
    }

    //  2. Find Previous Max from list
    static void findPreMaxLambdaExpresion(){

        int[] x = {1, 2, 8, 4, 9, 7, 1, 2, 4, 8, 15, 14, 15};

        long preMax = IntStream.of(x).distinct().sorted().max().getAsInt();
    }
}
class Person {
    private String name;
    private String address;

    public Person() {
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return name + " - " + address;
    }
}