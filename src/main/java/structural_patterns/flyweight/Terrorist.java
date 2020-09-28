package structural_patterns.flyweight;

public class Terrorist implements Player {

    private final String TASK;
    private String weapon;

    public Terrorist() {
        TASK = "Plant the bomb!";
    }

    @Override
    public void assignWeapon(String weapon) {
        // assign weapon
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        // Work on mission
        System.out.println("Terrorist with weapon: " + weapon + " , task: " + TASK);
    }
}
