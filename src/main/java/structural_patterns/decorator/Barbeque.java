package structural_patterns.decorator;

public class Barbeque extends ToppingsDecorator {

    Pizza pizza;

    public Barbeque(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " , and barbeque topping";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 25;
    }
}
