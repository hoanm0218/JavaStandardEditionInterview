package com.hoanm.java8.optional;


import java.util.Optional;

/**
 * Sử dụng phương thức map() có thể tồn tại các Optional lồng nhau.
 * Sử dụng phương thức flatMap(), các Optional lồng nhau sẽ được gộp (flat) lại một Optional duy nhất.
 */
public class OptionalExample4 {

    public static void main(String[] args) {
        Optional<String> optionalOf = Optional.of("String with Optional");
        Optional<String> optionalEmpty = Optional.empty();

        System.out.println(optionalOf.map(String::toLowerCase));
        System.out.println(optionalEmpty.map(String::toLowerCase));

        Optional<Optional<String>> multiOptional = Optional.of(Optional.of("String with multiple Optional"));

        System.out.println("Value of Optional object: " + multiOptional);
        System.out.println("Optional.map:             " + multiOptional.map(gender -> gender.map(String::toUpperCase)));
        System.out.println("Optional.flatMap:         " + multiOptional.flatMap(gender -> gender.map(String::toUpperCase)));
    }
}
