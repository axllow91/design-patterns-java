package structural_patterns.decorator;

// concrete pizza class
public class PeppyPanner extends Pizza {

    public PeppyPanner() {
        description = "PeppyPanner";
    }

    @Override
    public int getCost() {
        return 1990;

    }
}
