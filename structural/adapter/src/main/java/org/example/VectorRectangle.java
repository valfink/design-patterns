package org.example;

import java.util.ArrayList;

public class VectorRectangle extends ArrayList<Line> {
    public VectorRectangle(int startX, int startY, int width, int height) {
        add(new Line(new Point(startX, startY), new Point(startX + width, startY)));
        add(new Line(new Point(startX + width, startY), new Point(startX + width, startY + height)));
        add(new Line(new Point(startX + width, startY + height), new Point(startX, startY + height)));
        add(new Line(new Point(startX, startY + height), new Point(startX, startY)));
    }
}
