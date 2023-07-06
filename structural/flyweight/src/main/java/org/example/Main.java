package org.example;

public class Main {
    public static void main(String[] args) {
        User johannSebastianBach = new User("Johann Sebastian Bach");
        User wolfgangAmadeusMozart = new User("Wolfgang Amadeus Mozart");
        User sebastianAmadeus = new User("Sebastian Amadeus");
        System.out.println(johannSebastianBach.getFullName());
        System.out.println(wolfgangAmadeusMozart.getFullName());
        System.out.println(sebastianAmadeus.getFullName());
        System.out.println("All the names in the database:");
        System.out.println(User.printAllNames());
    }
}