# Decorator Pattern (Pizza Example) - Interview Script

## 1) Problem statement
In real systems, we often need many combinations of features.
If we create one class for every combination, class count explodes.
Decorator solves this by adding behavior dynamically at runtime.

## 2) Mapping to this code
- `BasePizza` is the component abstraction (`cost()`).
- `MargheritaPizza`, `FarmhousePizza`, `VegDelightPizza` are concrete components.
- `ToppingDecorator` is the decorator base class.
- `ExtraCheesePizza` and `MushroomPizza` are concrete decorators.

Each decorator stores a `BasePizza` object and adds its own cost.

## 3) How call flow works
For this line:
`new MushroomPizza(new ExtraCheesePizza(new VegDelightPizza())).cost()`

Execution flow:
1. `VegDelightPizza.cost()` returns `120`
2. `ExtraCheesePizza.cost()` adds `10` => `130`
3. `MushroomPizza.cost()` adds `15` => `145`

Final answer: `145`

## 4) Why interviewer likes this pattern
- Open/Closed Principle: add a new topping class without changing existing code.
- Runtime flexibility: choose combinations at runtime.
- Avoids huge inheritance trees like `CheeseMushroomVegDelightPizza`.

## 5) Time and space notes
- If we apply `n` decorators, one call to `cost()` is `O(n)`.
- Extra space is also `O(n)` due to wrapper objects.

## 6) 60-second crisp explanation
"Decorator Pattern lets us add responsibilities to an object dynamically by wrapping it.
Here, base pizzas provide base cost, and toppings are wrappers that also implement the same interface (`BasePizza` via `ToppingDecorator`).
So I can stack toppings like wrappers: `Mushroom(ExtraCheese(VegDelight))`.
Each wrapper calls inner `cost()` and adds its own amount.
This keeps code extensible and avoids creating a class for every topping combination."

## 7) How to run
From project root:
`javac DesignPatterns2/DecoratorPattern/*.java`
`java DesignPatterns2.DecoratorPattern.DecoratorPatternDemo`
