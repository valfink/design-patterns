# Singleton

- ensures that there exists only a single Object of a Class
- useful for example for database repositories, or when the constructor call is expensive or when instantiation is lazy

## Basic Implementation

- constructor must be private so it can't be accessed
- a field `private static final XXX INSTANCE = new XXX()` is defined, holding the Singleton instance
- a `public static XXX getInstance()` returns the Singleton instance
- for correct serialization (more importantly for correct deserialization), there has to be implemented
  a `protected Object readResolve()` that returns the instance

## Exceptions in constructor

- if the Singleton's constructor throws an `Exception`, the `private static XXX instance` can't be initialized inline (
  thus can't be `final`, so it shall not be all caps)
- A `static {...}` block can be used to create the actual instance and catch possible `Exceptions`

## Lazy instantiation

- if the Singleton is to be created only upon first use, `getInstance()` can construct it if needed:

```java
public static XXX getInstance(){
        if(instance==null){
        instance=new XXX();
        }
        return instance;
        }
```

- `instance` is not `final` anymore and thus not written in capital letters
- this opens possible race conditions in a multithreaded environment

## Monostate Singleton

- looks like a regular Java Class
- every data field is `static`
- it is possible to create a lot of instances, but all share the same state / data

## Multiton

- has a defined number of instances
- each instance is registered in a Subsystem and exists as a Singleton within it
- the Subsystem is an `enum`, alternatively an `int` or a `String` (both require another form of instance limiting then
  described here)
- a field `private static HashMap<Subsystem, XXX> INSTANCES = new HashMap<>()` is defined, holding all the instances
- the Multiton constructor is private like for the Singleton
- `public static XXX get(Subsystem subsystem)` returns the `Subsystem`'s instance (or creates it if not done yet)
