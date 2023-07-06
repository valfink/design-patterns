package org.example;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

// Console becomes the Facade through the factory method which hides all the low-level APIs
@AllArgsConstructor
public class Console {
    private final List<Viewport> viewports = new ArrayList<>();
    private int width;
    private int height;

    public void addViewport(Viewport viewport) {
        viewports.add(viewport);
    }

    public void render() {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                for (Viewport viewport : viewports) {
                    System.out.print(viewport.charAt(x, y));
                }
                System.out.println();
            }
        }
    }

    public static Console newConsole(int width, int height) {
        Buffer buffer = new Buffer(width, height);
        Viewport viewport = new Viewport(buffer, width, height, 0, 0);
        Console console = new Console(width, height);
        console.addViewport(viewport);
        return console;
    }
}
