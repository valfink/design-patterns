package org.example;

import lombok.AllArgsConstructor;

// low-level class
@AllArgsConstructor
public class Viewport {
    private final Buffer buffer;
    private final int width;
    private final int height;
    private final int offsetX;
    private final int offsetY;

    public char charAt(int x, int y) {
        return buffer.charAt(x + offsetX, y + offsetY);
    }
}
