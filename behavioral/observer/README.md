# Observer

- an object that wishes to be informed about events happening in the system
- the entity generating the events is an `Observable`
- instead of directly implementing an `Observer` and an `Obersvable`, it is often easier to use an event-based approach
  - with the event-based approach, when there are properties that depend on other properties, it gets complicated to
    observe those dependent props, as they don't have direct setters
