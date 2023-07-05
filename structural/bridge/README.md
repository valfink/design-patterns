# Bridge

- is used to decouple abstraction from implementation
- prevents a Cartesian product complexity explosion
- example:
  - a `Shape` Base class that could be rendered either as vector or raster
  - `Shape` can be implemented via `Square`, `Triangle`, `Circle`, …
  - this would result
    in `VectorSquare`, `RasterSquare`, `VectorTriangle`, `RasterTriangle`, `VectorCircle`, `RasterCircle`, …
  - -> to prevent this we can use the Bridge pattern
