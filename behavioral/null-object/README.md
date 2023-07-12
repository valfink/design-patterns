# Null Object

- a no-op object that conforms to the required interface, satisfying a dependency requirement of some other object
- could be an inheritor of the required object, or implementing the interface that is required
- is used when the required object must not be replaced with `null`
- all required methods will be implemented, but actually be empty – if method is non-void, return type default value
  shall be returned
- if the return values are used, it will get problematic
