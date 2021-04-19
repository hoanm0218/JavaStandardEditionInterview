package com.hoanm.exception.custom;


import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.List;

public class CustomExceptionExample {

    public static void main(String[] args) {
        List<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("Java");
        stringArrayList.add("C++");
        stringArrayList.add("PHP");
        stringArrayList.add("Python");
        int index = 4;

        if (index < stringArrayList.size()) {
            stringArrayList.remove(index);
        } else {
            throw new CustomException("Your index out of bounds List: " + index);
        }
    }
}

class CustomException extends RuntimeException {

    public CustomException() {
    }

    public CustomException(String errorMessage) {
        System.out.println(errorMessage);
    }

}