package structural_patterns.decorator;

public class SimplePizza extends Pizza {

    public SimplePizza() {
        description = "Simple pizza";
    }

    @Override
    public int getCost() {
        return 70;
    }
}
