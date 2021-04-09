package com.hoanm.oops;

public class OOPExample {

    public static void main(String[] args) {

        /**
         * Polymorphism principle
         * from animal we can have many ways to create instance
         */
        Animal animalDog = new Dog("Milo");
        Animal animalCat = new Cat("Jenni");


        System.out.println("Dog name: " + animalDog.getName());
        animalDog.speak();

        System.out.println("Dog name: " + animalCat.getName());
        animalCat.speak();

        animalDog.sleep();
        animalCat.sleep();

        ((Dog) animalDog).speed();
        ((Cat) animalCat).speed();
    }
}

/**
 * Abstraction principle
 * define common fields, behavior of Object
 */
//abstract class
abstract class Animal {
    //normal
    private String name;
    //static
    public static int age;
    //final
    protected static final boolean FINAL_ABSTRACT_VARIABLE = true;

    public Animal(String name) {
        this.name = name;
    }

    //Non abstract method
    public void speak() {
        System.out.println("Speaking...");
    }

    //abstract method
    public abstract void sleep();

    /**
     * Encapsulation principle
     * call method to get/set value of variables
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

//Interface
interface IRun {
    static final boolean FINAL_INTERFACE_VARIABLE = true;

    //Only have abstract method
    void speed();
}

/**
 * Inheritance principle
 * Dog extends abstract class Animal  and implements interface IRun
 * Dof will have all method/behavior of Animal
 */
class Dog extends Animal implements IRun {

    public Dog(String name) {
        super(name);
    }

    //implement abstract method of Aninal
    @Override
    public void sleep() {
        System.out.println("Dog sleep 8 hours/day");
    }

    //implement abstract method of Irun
    @Override
    public void speed() {
        System.out.println("Dog run with speed 10km/h");
    }
}

/**
 * Inheritance principle
 * Cat extends abstract class Animal  and implements interface IRun
 * Cat will have all method/behavior of Animal
 */
class Cat extends Animal implements IRun {

    public Cat(String name) {
        super(name);
    }

    //implement abstract method of Aninal
    @Override
    public void sleep() {
        System.out.println("Cat sleep 15 hours/day");
    }

    //implement abstract method of Irun
    @Override
    public void speed() {
        System.out.println("Cat run with speed 20km/h");
    }
}
