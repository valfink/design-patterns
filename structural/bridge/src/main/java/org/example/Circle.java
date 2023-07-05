package org.example;

public class Circle extends Shape {
    protected Circle(Renderer renderer) {
        super(renderer);
    }

    @Override
    public void draw() {
        renderer.renderShape();
    }
}
