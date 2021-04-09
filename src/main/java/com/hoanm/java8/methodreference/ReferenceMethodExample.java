package com.hoanm.java8.methodreference;

import java.util.Arrays;

public class ReferenceMethodExample {
    public static void main(String[] args) {
        //Reference Instance operation
        RunSpeed runSpeed = new RunSpeed();
        IRun dogRun = runSpeed::runNormal;
        System.out.println("Dog running");
        dogRun.run();

        //Reference static operation
        IRun catRun = RunSpeed::runMax;
        System.out.println("Cat running");
        catRun.run();

        //Reference constructor
        ISpeak dogSpeak = Speak::new;
        System.out.println("Dog Speak: ");
        dogSpeak.speak("Gau Gau");

        //Method reference to an instance operation of an arbitrary object of a particular type
        String[] stringArray = {"Steve", "Rick", "Aditya", "Negan", "Lucy", "Sansa", "Jon"};
        Arrays.sort(stringArray, String::compareToIgnoreCase);
        System.out.print("Array after sorted: ");
        for (String str : stringArray) {
            System.out.print(str + "  ");
        }
    }
}

class Speak {
    public Speak(String speak) {
        System.out.println("Speak with " + speak);
    }
}

@FunctionalInterface
interface ISpeak {
    Speak speak(String speak);
}

class RunSpeed {
    public void runNormal() {
        System.out.println("Run with 10km/h");
    }

    public static void runMax() {
        System.out.println("Run with 10km/h");
    }
}

@FunctionalInterface
interface IRun {
    void run();
}