package org.example;

import java.util.ArrayList;
import java.util.List;

// the actual Mediator
public class ChatRoom {
    private final List<Person> persons = new ArrayList<>();

    public void join(Person person) {
        broadcast("room msg", person.getName() + " joins the chat");
        persons.add(person);
        person.setChatRoom(this);
    }

    public void broadcast(String sender, String message) {
        persons.stream()
                .filter(p -> !p.getName().equals(sender))
                .forEach(p -> p.receive(sender, message));
    }

    public void privateMsg(String sender, String receiver, String message) {
        persons.stream()
                .filter(p -> p.getName().equals(receiver))
                .findFirst()
                .ifPresent(p -> p.receive(sender, message));
    }

}
