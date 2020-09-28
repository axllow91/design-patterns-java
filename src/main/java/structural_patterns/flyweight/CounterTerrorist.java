package structural_patterns.flyweight;

public class CounterTerrorist implements Player {

    private final String TASK;
    private String weapon;

    public CounterTerrorist() {
        TASK = "Defuse the bomb!";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        // Work on mission
        System.out.println("Terrorist with weapon: " + weapon + " , task: " + TASK);
    }
}
