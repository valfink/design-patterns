package org.example;

import java.util.function.Consumer;

// sample class to show property changed events firing
public class Person {
    private final Event<PropertyChangedEvent<Person>> propertyChangedEvent = new Event<>();
    private int age;

    // fire the event here!
    public void setAge(int age) {
        if (this.age == age) return;

        this.age = age;
        propertyChangedEvent.fire(new PropertyChangedEvent<>(this, "age"));
    }

    public Subscription<PropertyChangedEvent<Person>> subScribe(Consumer<PropertyChangedEvent<Person>> handler) {
        return propertyChangedEvent.addHandler(handler);
    }

    @Override
    public String toString() {
        return "Person{" +
                "propertyChangedEvent=" + propertyChangedEvent +
                ", age=" + age +
                '}';
    }
}
