package com.hoanm.java8.streamapi.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMapExample {

    public static void main(String[] args) {
        List<Hosting> listHosting = new ArrayList<>();

        listHosting.add(new Hosting(1, "facebook.com", 80000));
        listHosting.add(new Hosting(2, "youtube.com", 90000));
        listHosting.add(new Hosting(3, "google.com", 1));
        listHosting.add(new Hosting(4, "uni-dev.com", 1));
        listHosting.add(new Hosting(5, "java-tutorial.com", 1));

        //TH Key la ID, Value là Object
        System.out.println("************* KEY = ID, VALUE = hosting ************");
        Map<Integer, Hosting> mapHosting1 = listHosting.stream()
                .collect(Collectors.toMap(Hosting::getId, Function.identity(), (oldValue, newValue) -> oldValue));
        mapHosting1.forEach((key, value) -> System.out.println("Key: " + key + "\nValue: " + value));

        //TH key là ID, Value là 1 list Object
        System.out.println("************* KEY = websites, VALUE = list hosting ************");
        Map<Long, List<Hosting>> mapHosting2 = listHosting.stream()
                .collect(Collectors.toMap(Hosting::getWebsites, hosting -> {
                    List<Hosting> list = new ArrayList<>();
                    list.add(hosting);
                    return list;
                }, (oldValue, newValue) ->{
                    newValue.addAll(oldValue);
                    return newValue;
                }));
        mapHosting2.forEach((key, value) -> System.out.println("Key: " + key + "\nValue: " + value));

    }
}

class Hosting {
    private int id;
    private String name;
    private long websites;

    public Hosting() {
    }

    public Hosting(int id, String name, long websites) {
        this.id = id;
        this.name = name;
        this.websites = websites;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getWebsites() {
        return websites;
    }

    public void setWebsites(long websites) {
        this.websites = websites;
    }

    @Override
    public String toString() {
        return "[Id=" + id + ", Name=" + name + ", Websites=" + websites + "]";
    }
}