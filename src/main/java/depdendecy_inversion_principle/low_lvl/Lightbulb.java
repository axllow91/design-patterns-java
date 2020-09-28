package depdendecy_inversion_principle.low_lvl;

import depdendecy_inversion_principle.high_lvl.Switchable;

public class Lightbulb implements Switchable {

    @Override
    public void turnOn() {
        System.out.println("Lightbulb: Is turned on!");
    }

    @Override
    public void turnOff() {
        System.out.println("Lightbulb: Is turned off");
    }
}
