package com.hoanm.java8.streamapi.operation.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethodExample {

    // map() operation helps map elements to the corresponding results
    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User("User 1", 12, Arrays.asList("Java", "C++")),
                new User("User 2", 15, Arrays.asList("C#", "Python")),
                new User("User 3", 12, Arrays.asList("JavaScript")));

        //map() chỉ có tác dụng chuyển từ một Stream<R> sang Stream<T>
        List<String> nameList = users.stream()
                .map(User::getName)
                .collect(Collectors.toList());
        System.out.println(nameList);
        //flatMap() để làm phẳng dữ liệu từ Stream<Stream<T>> sang Stream<Stream>.
        List<String> subjectList = users.stream()
                .flatMap(user -> user.getSubjects().stream())
                .collect(Collectors.toList());
        System.out.println(subjectList);
    }
}

class User {
    private String name;
    private int age;
    List<String> subjects;

    public User() {
    }

    public User(String name, int age, List<String> subjects) {
        this.name = name;
        this.age = age;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }
}