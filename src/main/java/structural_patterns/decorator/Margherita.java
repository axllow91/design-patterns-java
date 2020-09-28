package structural_patterns.decorator;

public class Margherita extends Pizza {

    public Margherita() {
        description = "Margherita";
    }

    @Override
    public int getCost() {
        return 120;
    }
}
