package structural_patterns.decorator;

/*
* see UML https://media.geeksforgeeks.org/wp-content/uploads/uml-1.jpg
* */
public class PizzaStoreMain {
    public static void main(String[] args) {
        // create a new margherita pizza
        Pizza pizza = new Margherita();
        System.out.println(pizza.getDescription() + " ,Cost: " + pizza.getCost());

        // create a new Simple pizza
        Pizza simplePizza = new SimplePizza();

        // decorated with fresh tomato topping
        simplePizza = new FreshTomato(simplePizza);

        // decorate it with paneer topping
        simplePizza = new Paneer(simplePizza);

        System.out.println(simplePizza.getDescription() + " ,Cost: " + simplePizza.getCost());

        Pizza pizza1 = new Barbeque(null);
        System.out.println(pizza1.getDescription() + " ,Cost: " + pizza1.getCost());
    }
}
