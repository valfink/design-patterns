package org.example;

import java.util.Iterator;

public class BinaryTree<T> implements Iterable<T> {
    private final Node<T> root;

    public BinaryTree(Node<T> root) {
        this.root = root;
    }

    @Override
    public Iterator<T> iterator() {
        return new PreOrderIterator<>(root);
    }
}
