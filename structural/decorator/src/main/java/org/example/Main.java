package org.example;

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle(3);
        Shape square = new Square(2.5f);
        System.out.println(circle.info());
        System.out.println(square.info());
        Shape redCircle = new ColoredShape(new Circle(5), "red");
        System.out.println(redCircle.info());
    }
}