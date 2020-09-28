package structural_patterns.proxy.proxy_example_2;

public class Wizard {
    private final String name;

    public Wizard(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
       return name;
    }
}
