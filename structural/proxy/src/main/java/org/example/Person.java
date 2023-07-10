package org.example;

public class Person {
    // proxied property, will be logging every change, no escaping the logger!
    private Property<String> name;

    public Person() {
        name = new Property<>("");
    }

    public Person(String name) {
        this.name = new Property<>(name);
    }

    public void setName(String name) {
        this.name.setValue(name);
    }

    public String getName() {
        return name.getValue();
    }
}
