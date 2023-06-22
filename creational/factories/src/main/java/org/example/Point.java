package org.example;

public class Point {
    // x & y should probably be BigDecimals, but trigonometry gets difficult and this is just an example for factories!
    private double x;
    private double y;

    // Constructor could be private to force users to call factory methods
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // here come the Factory Methods!
    public static Point newFromCartesianCoordinates(double x, double y) {
        return new Point(x, y);
    }

    public static Point newFromPolarCoordinates(double rho, double theta) {
        return new Point(
                rho * Math.cos(theta), rho * Math.sin(theta)
        );
    }
}
