package org.example;

import java.util.*;
import java.util.function.Consumer;

// single element that masquerades as a collection (see below)
public class Neuron implements SomeNeurons {
    protected final List<Neuron> in = new ArrayList<>();
    protected final List<Neuron> out = new ArrayList<>();
    protected final String id = UUID.randomUUID().toString();

    // this is only to show that connecting has worked
    public void printConnections() {
        System.out.println("My ID is: " + id);
        System.out.println("INCOMING connections:");
        for (Neuron n : in) {
            System.out.println(n.id + " -> me");
        }
        System.out.println("OUTGOING connections:");
        for (Neuron n : out) {
            System.out.println("me -> " + n.id);
        }
    }

    // fake being a collection through Collections.singleton
    @Override
    public Iterator<Neuron> iterator() {
        return Collections.singleton(this).iterator();
    }

    @Override
    public void forEach(Consumer<? super Neuron> action) {
        action.accept(this);
    }

    @Override
    public Spliterator<Neuron> spliterator() {
        return Collections.singleton(this).spliterator();
    }
}
