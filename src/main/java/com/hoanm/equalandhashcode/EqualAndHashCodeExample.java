package com.hoanm.equalandhashcode;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EqualAndHashCodeExample {

    public static void main(String[] args) {

        Person person1 = new Person("UNI DEV", "HCM");
        Person person2 = new Person("ANH", "HN");
        Person person3 = new Person("ANH", "DakLak");

        System.out.println(person1.equals(person2));
        System.out.println(person1.getName().equals(person2.getName()) && person1.getAddress().equals(person2.getAddress()));
//        System.out.println(person1.hashCode());
//        System.out.println(person2.hashCode());
        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        System.out.println(personList);

        // Collections.sort(personList,Person::compareTo);
//        Collections.sort(personList, (o1, o2) -> o1.getName().hashCode() - o2.getName().hashCode());
//        System.out.println(personList);

        personList.sort((o1, o2) -> {
            if (o1.getName().compareTo(o2.getName()) > 0) {
                return 1;
            } else if (o1.getName().compareTo(o2.getName()) < 0) {
                return -1;
            } else {
                return o1.getAddress().compareTo(o2.getAddress());
            }
        });
        System.out.println(personList);

        //Khong duoc (ConcurrentModificationException)
//        for (Person p : personList) {
//            if(p.getName().equals("UNI DEV")){
//                personList.remove(p);
//            }
//        }
        for( int i = 0; i < personList.size(); i++){
            if(personList.get(i).getName().equals("UNI DEV")){
                personList.remove(i);
            }
        }
        System.out.println(personList);
    }
}

class Person implements Serializable, Comparable<Person> {
    private String name;
    private String address;

    public Person() {
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        if (obj.hashCode() != this.hashCode()) {
            return false;
        }
        return this.address.equals(person.address);
    }

    @Override
    public String toString() {
        return name + " - " + address;
    }

    @Override
    public int compareTo(Person o) {
        if (this.name.hashCode() == o.name.hashCode()) {
            return this.address.hashCode() - o.address.hashCode();
        }
        return this.name.hashCode() - o.name.hashCode();
    }
}