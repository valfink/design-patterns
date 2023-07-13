package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

// a generic event type that can be fired
public class Event<T> {
    private int count = 0;
    private final Map<Integer, Consumer<T>> handlers = new HashMap<>();

    // subscribing returns a subscription token (Memento pattern)
    public Subscription<T> addHandler(Consumer<T> handler) {
        int i = count++;
        handlers.put(i, handler);
        return new Subscription<>(this, i);
    }

    public void fire(T args) {
        handlers.values().forEach(h -> h.accept(args));
    }

    public void removeSubscription(int id) {
        handlers.remove(id);
    }
}
