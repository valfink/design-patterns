# Memento

- a token representing the system state
- lets us roll back to the state when the token was generated
- may or may not directly expose state information, is typically immutable
- a different approach to "undo" then the Command pattern (which recorded the commands, instead of recording the system
  state)
- example: bank account
  - all account operations could return a `AccountMementoToken`, which holds the same fields as the `BankAccount`
- alternatively, can also be used for interoperability between languages
  - example: a C++ function can be called from Java, but you can't generate a C++ object and work with it from Java
  - in C++, you can provide a function that generates the needed object and returns its memory location as an int ->
    this is the Memento
  - now you can call another provided C++ function that operates on that object, passing it the Memento so it can find
    the actual object
