package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static void drawPoint(Point point) {
        System.out.printf("(%2d,%2d): X%n", point.x(), point.y());
    }

    public static void main(String[] args) {
        ArrayList<VectorRectangle> vectorRectangles = new ArrayList<>(List.of(
                new VectorRectangle(1, 1, 10, 2),
                new VectorRectangle(5, 2, 2, 7)
        ));

        for (VectorRectangle vectorRectangle : vectorRectangles) {
            for (Line line : vectorRectangle) {
                new StraightLineToPointsBasicAdapter(line).forEach(Main::drawPoint);
                new StraightLineToPointsBasicAdapter(line).forEach(Main::drawPoint);
                new StraightLineToPointsCachingAdapter(line).forEach(Main::drawPoint);
                new StraightLineToPointsCachingAdapter(line).forEach(Main::drawPoint);
            }
        }
    }
}