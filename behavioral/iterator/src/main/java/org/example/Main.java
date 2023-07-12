package org.example;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Node<String> testNode = new Node<>(
                "Hello",
                new Node<>("World"),
                new Node<>(
                        "This",
                        new Node<>("Is"),
                        new Node<>(
                                "Major",
                                new Node<>("Tom"),
                                new Node<>("!")
                        )
                )
        );

        BinaryTree<String> tree = new BinaryTree<>(testNode);
        Iterator<String> iterator = tree.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}