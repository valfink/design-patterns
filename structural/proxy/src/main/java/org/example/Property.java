package org.example;

// the actual proxy, allows for logging (or other actions) when changing properties
public class Property<T> {
    private T value;

    public Property(T value) {
        // logging here, simulated through sout
        System.out.println("Initializing the property to: " + value);
        this.value = value;
    }

    public void setValue(T value) {
        // logging here, simulated through sout
        System.out.println("Changing the property to: " + value);
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
