# Mediator

- facilitates communication between components
- components are not necessarily aware of each other, don't need to have a direct reference to each other
- often the Mediator is a Singleton
- components typically call a method on the Mediator, which then calls methods on other connected components
- example: chat room
