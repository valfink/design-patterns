# Proxy

- a class that acts as an interface to a particular resource
- the resource may be remote, expensive to construct, require particular actions, ...
- proxy typically `extends` the class it is proxying, so existing code using the proxied class continues working
- while the Decorator provides an enhanced interface, the Proxy provides an identical interface
- to create a proxy, simply replicate the existing interface of an object

## Protection Proxy

- performs necessary checks on the base class before calling its method

## Property Proxy

- typically used for logging changes of properties of the base class
- could also substitute certain values of properties
- instead of using a data type as private prop directly, a `class Property<T>` is defined and used as data type
- inside the `Property` class, the getters and setters can handle the logging

## Dynamic Proxy for Logging

- a proxy which is constructed at runtime, not at compile time
- the proxy `implements InvocationHandler`, provided by the Java Reflection framework
- comes at a computational cost
