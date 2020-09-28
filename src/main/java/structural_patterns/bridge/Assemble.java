package structural_patterns.bridge;

// Concrete implementation 2 for bridge pattern
public class Assemble implements Workshop {
    @Override
    public void work() {
        System.out.println(" And ");
        System.out.println(" Assembled.");
    }
}
