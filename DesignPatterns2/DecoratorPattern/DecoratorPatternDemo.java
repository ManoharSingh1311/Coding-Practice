package DesignPatterns2.DecoratorPattern;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        BasePizza margherita = new MargheritaPizza();
        System.out.println("Margherita cost: " + margherita.cost());

        BasePizza margheritaWithCheese = new ExtraCheesePizza(margherita);
        System.out.println("Margherita + ExtraCheese cost: " + margheritaWithCheese.cost());

        BasePizza loadedVegPizza = new MushroomPizza(new ExtraCheesePizza(new VegDelightPizza()));
        System.out.println("VegDelight + ExtraCheese + Mushroom cost: " + loadedVegPizza.cost());

        BasePizza farmhouseWithDoubleToppings = new ExtraCheesePizza(new MushroomPizza(new FarmhousePizza()));
        System.out.println("Farmhouse + Mushroom + ExtraCheese cost: " + farmhouseWithDoubleToppings.cost());
    }
}
