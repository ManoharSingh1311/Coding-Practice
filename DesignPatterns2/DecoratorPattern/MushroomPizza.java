package DesignPatterns2.DecoratorPattern;

public class MushroomPizza extends ToppingDecorator {

    BasePizza basePizza;
    public MushroomPizza(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    public int cost(){
        return this.basePizza.cost()+15;
    }

    
}
