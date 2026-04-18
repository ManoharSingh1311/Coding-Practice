# Factory Pattern (Vehicle Example)

## Is this a good example?
Yes, this is a clean and practical example for Factory Pattern.

- `Vehicle` is the common interface.
- `Toyota` and `BMW` are concrete products.
- `VehicleFactory` has one method (`getVehicle`) to decide which object to create.
- Client (`VehicleFactoryMain`) never calls `new Toyota()` or `new BMW()` directly.

## Mapping in this code
- **Product interface:** `Vehicle`
- **Base variants:** `OrdinaryVehicle`, `LuxuryVehicle`
- **Concrete products:** `Toyota`, `BMW`
- **Factory:** `VehicleFactory`
- **Client:** `VehicleFactoryMain`

## How flow works
1. Client creates `VehicleFactory`.
2. Client calls `getVehicle("TOYOTA")` or `getVehicle("BMW")`.
3. Factory decides and returns the correct object.
4. Client works only with `Vehicle` abstraction (`assemble()`).

## Why this pattern helps
- Removes object creation logic from client.
- Reduces `if-else` clutter in business code.
- Easier to change creation logic in one place.

## Key things to remember
- Factory Pattern has **one factory** for a product hierarchy.
- Abstract Factory has **multiple factories** for related product families.
- Always program to interface, not implementation.
- Keep creation details hidden from client classes.

## Run
From project root:
`javac DesignPatterns2/FactoryPattern/*.java`

`java DesignPatterns2.FactoryPattern.VehicleFactoryMain`
