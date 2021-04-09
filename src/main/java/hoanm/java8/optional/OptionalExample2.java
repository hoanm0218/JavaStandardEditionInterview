package hoanm.java8.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalExample2 {
    public static void main(String[] args) {
        // Pre java 8
        List<String> list = getList();
        List<String> list1 = list != null ? list : new ArrayList<>();

        // Java 8
        List<String> listOptional1 = getListOptional().orElse(new ArrayList<>());
        List<String> listOptional2 = getListOptional().orElseGet(ArrayList::new);
        //List<String> listOptional2 = getListOptional().orElseGet(() -> new ArrayList<>());
    }

    private static List<String> getList() {
        return null;
    }

    private static Optional<List<String>> getListOptional() {
        return Optional.ofNullable(null);
    }
}
