package org.example;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private final String name;
    private ChatRoom chatRoom;

    private final List<String> chatMessages = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setChatRoom(ChatRoom chatRoom) {
        this.chatRoom = chatRoom;
    }

    public void receive(String sender, String message) {
        String s = sender + ": " + message;
        System.out.println("[" + name + "'s session]" + s);
        chatMessages.add(s);
    }

    public void send(String message) {
        chatRoom.broadcast(getName(), message);
    }

    public void privateMsg(String receiver, String message) {
        chatRoom.privateMsg(getName(), receiver, message);
    }
}
