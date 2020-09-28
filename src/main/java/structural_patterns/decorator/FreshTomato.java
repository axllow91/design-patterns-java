package structural_patterns.decorator;

// concrete class of topings
public class FreshTomato extends ToppingsDecorator {

    // we need a reference to obj we are decorating
    Pizza pizza;

    public FreshTomato(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " , Fresh Tomato";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 20;
    }
}
