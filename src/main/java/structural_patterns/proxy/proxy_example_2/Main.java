package structural_patterns.proxy.proxy_example_2;

public class Main {
    public static void main(String[] args) {
        var proxy = new WizardTowerProxy(new IvoryTower());
        proxy.enter(new Wizard("Red wizard"));
        proxy.enter(new Wizard("White wizard"));
        proxy.enter(new Wizard("Black wizard"));
        proxy.enter(new Wizard("Blue wizard"));
        proxy.enter(new Wizard("Green wizard"));

    }
}
