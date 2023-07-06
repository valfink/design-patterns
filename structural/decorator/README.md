# Decorator

- can be used when wanting to augment an object with additional functionality
- existing code should not be rewritten, according to open-closed principle
- also, new functionality should be kept separate, according to single responsibility principle
- probably existing structures already interact with the class, so old behaviour needs not to be broken
- inheriting is one option, but not for `final` classes (like `String`)
- otherwise we use a Decorator which references the decorated object
  - this possibly involves delegation of some or all the existing methods of the decorated object

```java
public class MyStringDecorator {
  private String actualString;

  // add constructor with String

  // then delegation of methods:
  public int length() {
    return actualString.length();
  }
  // continue with the other ~80 String methods :(
}
```
