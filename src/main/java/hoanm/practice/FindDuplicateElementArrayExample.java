package hoanm.practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateElementArrayExample {

    /**
     * Find Duplicate element in an Array
     * - Option 1: Loop array
     * - Option 2: HashSet
     * - Option 3: HashMap
     * - Option 4: Streams API
     *        4.1 Streams Set + filter()
     *        4.2 Streams groupingBy
     *        4.3 Streams using frequency
     */

    public static void main(String[] args) {
        String[] strs = {"Uni", "Uni", "UNI", "DEV"};

        System.out.println("\nUsing Loop Array:");
        findDuplicateElementInArrayOption1(strs);

        System.out.println("\nUsing HashSet:");
        findDuplicateElementInArrayOption2(strs);

        System.out.println("\nUsing HashMap:");
        findDuplicateElementInArrayOption3(strs);

        System.out.println("\nUsing Streams:");
        findDuplicateElementInArrayOption41(strs);
        findDuplicateElementInArrayOption42(strs);
        findDuplicateElementInArrayOption43(strs);
    }

    //  Option 1: Loop Array
    static void findDuplicateElementInArrayOption1(String[] arrs) {

        for (int i = 0; i < arrs.length; i++) {
            for (int j = i + 1; j < arrs.length; j++) {
                if (arrs[i].equals(arrs[j])) {
                    System.out.println(arrs[i]);
                }
            }
        }
    }

    //  Option 2: HashSet
    static void findDuplicateElementInArrayOption2(String[] arrs) {

        Set<String> hashSet = new HashSet<>();
        for (String element : arrs) {
            if (hashSet.add(element) == false) {
                System.out.println(element);
            }
        }
    }

    //  Option 3: HashMap
    static void findDuplicateElementInArrayOption3(String[] arrs) {

        Map<String, Integer> hashMap = new HashMap<>();
        for (String element : arrs) {
            Integer count = hashMap.get(element);
            if (hashMap.containsKey(element) == false) {
                hashMap.put(element, 1);
            } else {
                hashMap.put(element, ++count);
            }
        }
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }

    //  Option 4: Streams API
    //      4.1 Streams Set + filter()
    static void findDuplicateElementInArrayOption41(String[] arrs) {

        Set<String> dataSet = new HashSet<>();
        Set<String> dupSet = Arrays.asList(arrs).stream().filter(s -> !dataSet.add(s)).collect(Collectors.toSet());
        System.out.println(dupSet);
    }

    //      4.2 Streams grouping by
    static void findDuplicateElementInArrayOption42(String[] arrs) {

        Set<String> dupSet = Arrays.asList(arrs)
                                        .stream()
                                            .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                                                .entrySet()
                                                    .stream()
                                                        .filter(s -> s.getValue() > 1)
                                                            .map(Map.Entry::getKey)
                                                                .collect(Collectors.toSet());
        System.out.println(dupSet);
    }

    //      4.3 Streams using frequency
    static void findDuplicateElementInArrayOption43(String[] arrs) {

        List<String> lists = Arrays.asList(arrs);
        Set<String> dupSet = lists.stream()
                                    .filter(s -> Collections.frequency(lists,s) > 1)
                                        .collect(Collectors.toSet());
        System.out.println(dupSet);
    }
}



























