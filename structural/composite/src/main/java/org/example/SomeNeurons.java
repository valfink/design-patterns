package org.example;

public interface SomeNeurons extends Iterable<Neuron> {
    default void connectTo(SomeNeurons other) {
        if (this.equals(other)) {
            return;
        }

        // this works with a for-each loop, so a single element will have to fake being a collection
        for (Neuron from : this) {
            for (Neuron to : other) {
                from.out.add(to);
                to.in.add(from);
            }
        }
    }
}
