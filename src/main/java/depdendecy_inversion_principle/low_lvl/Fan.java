package depdendecy_inversion_principle.low_lvl;

import depdendecy_inversion_principle.high_lvl.Switchable;

public class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan: Is turned on!");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan: Is turned off");
    }
}
