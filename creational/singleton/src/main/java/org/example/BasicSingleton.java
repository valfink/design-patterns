package org.example;

public class BasicSingleton {
    // this is the only instance that will be made visible
    private static final BasicSingleton INSTANCE = new BasicSingleton();

    // constructor is made private, can only be accessed from within this class
    private BasicSingleton() {
        System.out.println("Instantiating the Basic Singleton...");
    }

    public static BasicSingleton getInstance() {
        System.out.println("Returning the Basic Singleton instance...");
        return INSTANCE;
    }
}
