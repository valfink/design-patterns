package org.example;

public interface SomeNeurons extends Iterable<Neuron> {
    default void connectTo(SomeNeurons other) {
        if (this.equals(other)) {
            return;
        }

        for (Neuron from : this) {
            for (Neuron to : other) {
                from.out.add(to);
                to.in.add(from);
            }
        }
    }
}
