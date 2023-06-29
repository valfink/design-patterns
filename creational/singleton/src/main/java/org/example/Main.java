package org.example;

import org.example.multiton.SimpleMultiton;
import org.example.multiton.Subsystem;

public class Main {
    public static void main(String[] args) {
        System.out.println("Will get the Basic Singleton now...");
        BasicSingleton basicSingleton = BasicSingleton.getInstance();
        System.out.println(basicSingleton);
        System.out.println("Getting \"another\" Basic Singleton");
        BasicSingleton basicSingleton2 = BasicSingleton.getInstance();
        System.out.println(basicSingleton2);

        System.out.println("Will get the Lazy Singleton now...");
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(lazySingleton);

        System.out.println("Will get the first Multiton now...");
        SimpleMultiton simpleMultiton1 = SimpleMultiton.get(Subsystem.FIRST);
        System.out.println(simpleMultiton1);
        System.out.println("Will get the second...");
        SimpleMultiton simpleMultiton2 = SimpleMultiton.get(Subsystem.SECOND);
        System.out.println(simpleMultiton2);
        System.out.println("Now getting another of the second...");
        SimpleMultiton simpleMultiton1v2 = SimpleMultiton.get(Subsystem.SECOND);
        System.out.println(simpleMultiton1v2);
        System.out.println("Now also getting the third...");
        SimpleMultiton simpleMultiton3 = SimpleMultiton.get(Subsystem.THIRD);
        System.out.println(simpleMultiton3);

    }
}