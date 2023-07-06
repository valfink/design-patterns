package org.example;

public class Circle implements Shape {
    private final float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public String info() {
        return "I am a circle with the radius " + radius;
    }
}
