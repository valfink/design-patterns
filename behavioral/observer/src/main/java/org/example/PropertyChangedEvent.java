package org.example;

// this will be the Object containing the new information
public record PropertyChangedEvent<T>(
        T source,
        // instead of a String, an enum would be better!
        String propertyName
) {
}
