package structural_patterns.decorator;

public class Paneer extends ToppingsDecorator {

    Pizza pizza;

    public Paneer(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " , Paneer";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 40;
    }
}
