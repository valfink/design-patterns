# Template Method

- allows to define the 'skeleton' of an algorightm, with concrete implementations defined in subclasses
- very similar to Strategy pattern
  - Strategy works through composition:
    - high-level algorithm uses an interface
    - concrete implementations implement the interface
  - Template Method works through inheritance
    - overall algorithm makes use of abstract members
    - inheritors override the abstract members
    - parent template method invoked
