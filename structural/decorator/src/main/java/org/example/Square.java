package org.example;

public class Square implements Shape {
    private final float side;

    public Square(float side) {
        this.side = side;
    }

    @Override
    public String info() {
        return "This is a square with a side length of " + side;
    }
}
