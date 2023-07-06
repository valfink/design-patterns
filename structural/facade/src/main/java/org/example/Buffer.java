package org.example;

import lombok.AllArgsConstructor;

// low-level class
@AllArgsConstructor
public class Buffer {
    private char[] chars;
    private int lineWidth;

    public char charAt(int x, int y) {
        return chars[y * lineWidth + x];
    }
}
