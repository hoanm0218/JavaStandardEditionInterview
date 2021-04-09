package hoanm.java8.streamapi.operation.teminal;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectMethodExample {

    public static void main(String[] args) {
        // collect() operation helps to collect the stream result in a collection like list
        List<String> data = Arrays.asList("Javascript", "Java", "C#", "PHP", "C++");
        Set<String> languages = data.stream().sorted().collect(Collectors.toSet());
        System.out.println(languages);

    }
}
