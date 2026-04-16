package DesignPatterns2.DecoratorPattern;

public class ExtraCheesePizza extends ToppingDecorator {

    BasePizza basePizza;
    public ExtraCheesePizza(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    public int cost(){
        return this.basePizza.cost()+10;
    }

    
}
