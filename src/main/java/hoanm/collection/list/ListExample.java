package hoanm.collection.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

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
        System.out.println(arrayList);


        //LINKED LIST
        System.out.println("**********LinkedList*********");
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Java");
        linkedList.add("C++");
        linkedList.add("P");
        System.out.println(linkedList);
        linkedList.sort(Comparator.comparingInt(String::length));
        System.out.println(linkedList);


    }
}

