package org.example;

public class BasicSingleton {
    // this is the only instance that will be made visible
    private static final BasicSingleton INSTANCE = new BasicSingleton();

    // constructor is made private, can only be accessed from within this class
    private BasicSingleton() {
    }

    public static BasicSingleton getInstance() {
        return INSTANCE;
    }
}
