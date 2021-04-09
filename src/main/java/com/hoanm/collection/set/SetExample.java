package com.hoanm.collection.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {

        /*
        * SET:
        * - A interface extends from collection interface
        * - Storage data not duplicate value
        * - Not keeps the order of elements when adding to the List
        * - Class implements Set: HastSet, LinkedHashSet, TreeSet
        * */

        //ARRAYLIST
        System.out.println("**********HastSet*********");
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Java");
        hashSet.add("C++");
        hashSet.add("Python");
        hashSet.add("Java");
        System.out.println("HashSet print: " + hashSet);

        //LINKED LIST
        System.out.println("**********TreeSet*********");
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Java");
        treeSet.add("C++");
        treeSet.add("Python");
        treeSet.add("Python");
        System.out.println("HashSet print: " + treeSet);
        
    }
}
