# Builder pattern

- Is used to create an object piece by piece, instead of calling a massive constructor with a lot of arguments
- Should be fluent (-> return itself in every step), to allow for semantic building

## Self-referencing generics:

- Can be used in conjunction with inheritance
- Are needed to create a fluent builder in combination with inheritance
- Example:
  - A `PersonBuilder` builds a generic person
  - A `WorkingPersonBuilder` extends the Builder and provides possibility, to add a Job
  - In order to always return the right type while building fluently, the `PersonBuilder` must use a Generic:  
    `class PersonBuilder<S extends PersonBuilder<S>>`
  - The `WorkingPersonBuilder` now can inherit:  
    `class WorkingPersonBuilder extends PersonBuilder<WorkingPersonBuilder>>`

## Facade builder:

- Can be used to combine different builders for sub-parts of the object to be built
- Must ensure that all the different builders operate on the same object through dependency injection
