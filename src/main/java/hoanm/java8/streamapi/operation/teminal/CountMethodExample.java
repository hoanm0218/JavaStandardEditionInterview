package hoanm.java8.streamapi.operation.teminal;

import java.util.Arrays;
import java.util.List;

public class CountMethodExample {

    public static void main(String[] args) {
        // count() operation return the aggregate count for stream data
        List<String> data = Arrays.asList("Javascript", "Java", "C#", "PHP", "C++");
        int count = (int)data.stream().filter(s -> !s.equalsIgnoreCase("Java")).count();
        System.out.println("Count after filter are: " + count);
    }
}
