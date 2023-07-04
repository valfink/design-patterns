# Adapter

- adapts an existing interface to conform to the required interface

## Basic Adapter example

- there is a list of vector line objects, each contains a list of lines, that we want to draw
- the `draw` method only accepts single points with coordinates
- we have to define and use an Adapter:

```java
class LineToPointAdapter extends ArrayList<Point> {
    public LineToPointAdapter(Line line) {
        //...
    }
}
```

## Caching Adapter

- sometimes the Adapter is called several times on the same source object
- in that case, performance can be improved by using a cache
- to be able to do it, all the source elements have to implement `hashCode` and `equals`
- a straightforward way is to implement `Iterable` (needing to implement `iterator`, `forEach` and `spliterator`)

```java
public class LineToPointsCachingAdapter implements Iterable<Point> {
    public LineToPointsCachingAdapter(Line line) {
        //...
    }
}
```
