package structural_patterns.decorator;

// Abstract Pizza class (All classes extend
// from this)
abstract class Pizza {
    // it is an abstract pizza
    String description = "Unknown Pizza";

    public String getDescription() {
        return description;
    }

    public abstract int getCost();
}
