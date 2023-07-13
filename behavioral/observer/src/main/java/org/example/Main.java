package org.example;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Subscription<PropertyChangedEvent<Person>> subscription = person.subScribe(
                e -> System.out.println("Person's " + e.propertyName() + " has changed: " + e.source())
        );
        try (subscription) {
            person.setAge(30);
            person.setAge(32);
        }
        person.setAge(34);
        System.out.println("You didn't get notified about the new state: " + person);
    }
}