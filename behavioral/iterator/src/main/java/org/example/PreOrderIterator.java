package org.example;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class PreOrderIterator<T> implements Iterator<T> {
    private final Node<T> root;
    private Node<T> current;

    public PreOrderIterator(Node<T> root) {
        this.root = root;
    }

    private Node<T> findNextNode() {
        if (current == null) return root;

        if (current.getLeft() != null) return current.getLeft();

        if (current.getRight() != null) return current.getRight();

        Node<T> checkingNow = current;
        while (checkingNow.getParent() != null) {
            if (checkingNow.getParent().getLeft() == checkingNow
                    && checkingNow.getParent().getRight() != null) {
                return checkingNow.getParent().getRight();
            }
            checkingNow = checkingNow.getParent();
        }

        return null;
    }

    @Override
    public boolean hasNext() {
        return findNextNode() != null;
    }

    @Override
    public T next() {
        current = findNextNode();
        if (current != null) return current.getValue();

        throw new NoSuchElementException("The iteration has no more elements!");
    }
}
