# Visitor

- Visitor adds extra behaviour to an entire class hierarchy
- the Visitor is allowed to traverse the entire inheritance hierarchy
- typical implementation: double dispatch
  - throughout the entire hierarchy, an `accept(Visitor visitor)` method is propagated, each simply
    calling `visitor.visit(this)`
  - the Visitor implements overloaded the `visit(...)` method with each possible
    datatype (`visit(Foo foo)`, `visit(Bar bar)`, ...)
- example: make a document model printable to HTML / Markdown
  - the whole document is modelled through objects with sub-objects
  - we don't want to modify every class in the hierarchy
  - we need access to the non-common aspects of classes in the hierarchy
  - we want to use an external component to handle rendering, but avoid using type checks / casting
