package org.example;

import java.util.*;
import java.util.function.Consumer;

// to use the cache, extending ArrayList doesn't work, so we implement Iterable of target data type
// we thus need to implement the iterator, forEach, spliterator methods
public class StraightLineToPointsCachingAdapter implements Iterable<Point> {
    // static var just to keep track of how many lines have been converted, not for production
    private static int generatorCount = 0;
    // the actual cache – must be static so every instance can access it!
    private static final Map<Integer, List<Point>> cache = new HashMap<>();
    // the hash code for the current instance
    private final int hashCode;

    public StraightLineToPointsCachingAdapter(Line line) {
        hashCode = line.hashCode();
        System.out.println("Hash code for current line: " + hashCode);
        // check if hash code is already in cache
        if (cache.get(hashCode) != null) {
            System.out.println("Line is already in cache :)");
            return;
        }

        System.out.printf("%d: Generating points for (%d / %d) -> (%d / %d).%n",
                ++generatorCount, line.start().x(), line.start().y(), line.end().x(), line.end().y());

        ArrayList<Point> points = new ArrayList<>();

        if (line.start().x() == line.end().x()) {
            for (
                    int y = Math.min(line.start().y(), line.end().y());
                    y <= Math.max(line.start().y(), line.end().y());
                    y++) {
                points.add(new Point(line.start().x(), y));
            }
        } else {
            for (
                    int x = Math.min(line.start().x(), line.end().x());
                    x <= Math.max(line.start().x(), line.end().x());
                    x++
            ) {
                points.add(new Point(x, line.start().y()));
            }
        }

        cache.put(hashCode, points);
    }


    @Override
    public Iterator<Point> iterator() {
        return cache.get(hashCode).iterator();
    }

    @Override
    public void forEach(Consumer<? super Point> action) {
        cache.get(hashCode).forEach(action);
    }

    @Override
    public Spliterator<Point> spliterator() {
        return cache.get(hashCode).spliterator();
    }
}
