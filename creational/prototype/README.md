# Prototype

- A partially or fully initialized object that you copy and make use of
- Copying requires deep cloning of nested Objects!
- `Object.clone()` performs a shallow copy, so is **not** to be used

## Copy Constructor

- is an Object of Type `T`'s constructor that takes as input argument a `T other`, to produce a copy of `other`

```java
class Test {
  public String content;

  // insert regular constructor here

  // copy constructor  
  Test(Test other) {
    this(other.content);
  }
}
```

- to work, a copy constructor needs to be implemented on all levels of nested Objects!

## Copy through Serialization

- solution to be able to deep copy an Object without needing to write a bunch of nested copy constructors
- Class only needs to implement `Serializable` – but not to override any methods (in fact, `Serializable` doesn't have
  any at all)
- all nested Objects need to implement `Serializable` as well!
- Object `o` then can be deep copied through `org.apache.commons.lang3.SerializationUtils.roundtrip(o)`
- alternatively, other libraries can be used, e.g. to work through reflections (without needing to
  implement `Serializable`)
