package org.example;

// the token that you get after subscribing to an event - can be used in a
// try-with-resource statement and then auto closed, unsubscribing
public class Subscription<T> implements AutoCloseable {
    private final Event<T> event;
    private final int id;

    public Subscription(Event<T> event, int id) {
        this.event = event;
        this.id = id;
    }

    @Override
    public void close() {
        event.removeSubscription(id);
    }
}
