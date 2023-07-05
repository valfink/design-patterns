package org.example;

public class Main {
    public static void main(String[] args) {
        Renderer rasterRenderer = new RasterRenderer();
        Renderer vectorRenderer = new VectorRenderer();
        Shape circle = new Circle(rasterRenderer);
        circle.draw();
        circle.setRenderer(vectorRenderer);
        circle.draw();
    }
}