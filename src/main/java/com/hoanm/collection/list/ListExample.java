package com.hoanm.collection.list;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {

        /*
         * LIST:
         * - A interface extends from collection interface
         * - Storage data duplicate value
         * - Keeps the order of elements when adding to the List
         * - Class implements List: ArrayList, LinkedList, Vector
         * */

        //ARRAYLIST
        System.out.println("**********ArrayList*********");
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("C++");
        arrayList.add("Python");
        arrayList.add("PHP");
        // [Java, C++, Python, PHP]
        System.out.println(arrayList);
        arrayList.sort(String::compareTo);
        System.out.println(arrayList);
        System.out.println(arrayList.hashCode());


        //LINKED LIST
        System.out.println("**********LinkedList*********");
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Java");
        linkedList.add("C++");
        linkedList.add("Python");
        // [Java,123]->[C++,456]->[Python,null]
        // Trong do 123 la dia chi luu tru cua C++
        System.out.println(linkedList);
        linkedList.sort(Comparator.comparingInt(String::length));
        System.out.println(linkedList);


    }
}

