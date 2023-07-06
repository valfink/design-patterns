package org.example;

// this is a Decorator class
public class ColoredShape implements Shape {
    private final Shape shape;
    private final String color;

    public ColoredShape(Shape shape, String color) {
        this.shape = shape;
        this.color = color;
    }

    @Override
    public String info() {
        return shape.info() + " and in the color " + color;
    }
}
