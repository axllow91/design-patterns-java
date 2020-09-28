package structural_patterns.proxy.proxy_example_2;

public class WizardTowerProxy implements WizardTower{

    private static final int NUM_WIZARD_ALLOWED = 3;

    private int numWizards;
    private final WizardTower tower;

    public WizardTowerProxy(WizardTower tower) {
        this.tower = tower;
    }

    @Override
    public void enter(Wizard wizard) {
        if(numWizards < NUM_WIZARD_ALLOWED) {
            tower.enter(wizard);
            numWizards++;
        } else
            System.out.printf("%s is not allowed to enter!\n", wizard);
    }
}
