# Strategy

- enables the exact behaviour of a system to be selected either at run-time (dynamic) or compile-time (static)
- aka a *policy* in C++
- implementation:
    - define an algorithm at a high level
    - define the interface you expect each strategy to follow
    - provide for either dynmaic or static composition of strategy in the overall algorithm
- example: output a list of Strings either in Markdown or in HTML
    - strategy is to have a list start, adding a list item, list end
    - concrete implementation of the text output for each step varies (e.g. in Markdown start and end are not needed,
      thus empty)
