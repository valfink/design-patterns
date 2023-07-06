package org.example;

// low-level class
public class Buffer {
    private final char[] chars;
    private final int lineWidth;

    public Buffer(int lineWidth, int lineHeight) {
        this.lineWidth = lineWidth;
        chars = new char[lineWidth * lineHeight];
    }

    public char charAt(int x, int y) {
        return chars[y * lineWidth + x];
    }
}
