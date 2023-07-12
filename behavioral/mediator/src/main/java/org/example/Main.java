package org.example;

public class Main {
    public static void main(String[] args) {
        Person wolfgangAmadeusMozart = new Person("Wolfgang Amadeus Mozart");
        Person ludwigVanBeethoven = new Person("Ludwig van Beethoven");
        ChatRoom chatRoom = new ChatRoom();
        chatRoom.join(wolfgangAmadeusMozart);
        chatRoom.join(ludwigVanBeethoven);
        wolfgangAmadeusMozart.send("Hi peeps!");
        ludwigVanBeethoven.send("Hey Wolfi!");
        Person johannSebastianBach = new Person("Johann Sebastian Bach");
        chatRoom.join(johannSebastianBach);
        johannSebastianBach.send("Hey guys! :)");
        wolfgangAmadeusMozart.privateMsg("Ludwig van Beethoven", "Oh no, I hoped that he wouldn't show up :(");
    }
}