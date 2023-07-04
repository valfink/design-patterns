package org.example;

import java.util.ArrayList;

// Adapter should extend the target data type or a List of it
public class StraightLineToPointsBasicAdapter extends ArrayList<Point> {
    // static var just to keep track of how many lines have been converted, not for production
    private static int generatorCount = 0;

    // provide constructor with the input data type as argument
    public StraightLineToPointsBasicAdapter(Line line) {
        System.out.printf("%d: Generating UNCACHED points for (%d / %d) -> (%d / %d).%n",
                ++generatorCount, line.start().x(), line.start().y(), line.end().x(), line.end().y());

        if (line.start().x() == line.end().x()) {
            for (
                    int y = Math.min(line.start().y(), line.end().y());
                    y <= Math.max(line.start().y(), line.end().y());
                    y++) {
                add(new Point(line.start().x(), y));
            }
        } else {
            for (
                    int x = Math.min(line.start().x(), line.end().x());
                    x <= Math.max(line.start().x(), line.end().x());
                    x++
            ) {
                add(new Point(x, line.start().y()));
            }
        }
    }
}
