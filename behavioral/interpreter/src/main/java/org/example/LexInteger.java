package org.example;

public record LexInteger(
        int value
) implements LexElement {
    @Override
    public int eval() {
        return value;
    }
}
