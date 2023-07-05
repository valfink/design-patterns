# Composite

- a mechanism for treating individual objects and compositions of objects (e.g. Lists) in a uniform manner
- in Java, typically this is achieved through an `interface` which `extends Iterable<T>`
- an individual object implementing the interface can masquerade as a collection through `Collections.singleton(this)`
- now both the individual element and the collection can be treated in the same manner, e.g. with a for-each loop
