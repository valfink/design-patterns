# Factories

- Factories are used to create Objects as a whole (not piece by piece)
- They are handy when there are several possible constructors with the same argument data types (e.g. a `Point` object
  that can be constructed with either cartesian or polar coordinates, both for example of type `BigDecimal`)

## Factory Method

- `static` method(s) to create new Objects
- typically, the Object's constructor will be `private` so a user has to call the factory method

## Factory

- puts all the `Factory Methods` into a seperate class
- if the Object's constructor stays `private`, the `Factory Class` has to be defined within the Object Class to be able
  to access the constructor!
- otherwise, the Object's constructor needs to be made `public`

## Abstract Factory

- can be used to represent a hierarchy of Objects
- a Factory `Interface` defines the needed method(s) that will be implemented by the factories
