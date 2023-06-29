package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Will get the Basic Singleton now...");
        BasicSingleton basicSingleton = BasicSingleton.getInstance();
        System.out.println(basicSingleton);
        System.out.println("Getting \"another\" Basic Singleton");
        BasicSingleton basicSingleton2 = BasicSingleton.getInstance();
        System.out.println(basicSingleton2);
    }
}