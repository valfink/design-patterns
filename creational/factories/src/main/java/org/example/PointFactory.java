package org.example;

public class PointFactory {
    public static Point newFromCartesianCoordinates(double x, double y) {
        return new Point(x, y);
    }

    public static Point newFromPolarCoordinates(double rho, double theta) {
        return new Point(
                rho * Math.cos(theta), rho * Math.sin(theta)
        );
    }
}
