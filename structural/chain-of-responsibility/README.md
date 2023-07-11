# Chain of Responsibility

- a chain of commands that all get a chance to process a command or a query, optionally having default processing
  implementation and an ability to terminate the processing chain
- can be implemented as a chain of references (linked list, each object linking to the next) or a centralized
  construct (map or list of all objects in a central supervising object of another class)

## Method chain

- a chain that works by a method automatically calling the next method in the chain when it is finished
- example:
    - could be implemented by a `handle()` method on a base class that calls `next.handle()` (only if `next != null`)
    - the actual chain consists of Objects that inherit from the base class and `Override` the `handle()` method,
      finally calling `super.handle()` to ensure the chain continues
    - to terminate the chain operation before the end of the chain, one Object could just not call `super.handle()`

## Command Query Separation

- separating command operations (asking for an action or a change) and query operations (asking for information / state)
- implemented for example by getters and setters, instead of direct access to fields
- the getters and setter could then call other methods in the chain
