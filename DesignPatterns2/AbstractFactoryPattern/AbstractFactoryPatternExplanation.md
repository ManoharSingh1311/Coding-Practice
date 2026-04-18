# Abstract Factory Pattern (Vehicle Example)

## Is this a good example?
Yes, this is a strong interview-level example.

- `Vehicle` is the common product interface.
- You have **two product families**: ordinary and luxury vehicles.
- Family-specific factories create objects from their own family:
  - `OrdinaryVehicleFactory` -> `Toyota`, `Honda`
  - `LuxuryVehicleFactory` -> `BMW`, `Mercedes`
- `VehicleFactoryProvider` chooses which family factory to provide.

This is exactly where Abstract Factory is useful: when related products must be created together using family-wise rules.

## Mapping in this code
- **Abstract product:** `Vehicle`
- **Concrete products:** `Toyota`, `Honda`, `BMW`, `Mercedes`
- **Abstract factories (family contracts):** `OrdinaryVehicle`, `LuxuryVehicle`
- **Concrete factories:** `OrdinaryVehicleFactory`, `LuxuryVehicleFactory`
- **Factory-of-factories/provider:** `VehicleFactoryProvider`
- **Client:** `AbstractFactoryMain`

## How flow works
1. Client asks `VehicleFactoryProvider` for a family factory.
2. Client calls `createVehicle(brand)` on that family factory.
3. Factory returns the right concrete vehicle object.
4. Client uses the common `Vehicle` interface (`assemble()`).

## Why this pattern helps
- Keeps family rules in one place.
- Prevents mixing incompatible families.
- Easy to add a new family factory without changing client logic.

## Key things to remember
- Use **Factory Pattern** when there is one factory for one product hierarchy.
- Use **Abstract Factory Pattern** when there are **multiple related product families**.
- Client code should depend on abstractions, not concrete classes.
- Creation logic stays centralized and testable.

## Run
From project root:
`javac DesignPatterns2/AbstractFactoryPattern/*.java`

`java DesignPatterns2.AbstractFactoryPattern.AbstractFactoryMain`
