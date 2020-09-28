package depdendecy_inversion_principle;

import depdendecy_inversion_principle.high_lvl.ElectricPowerSwitch;
import depdendecy_inversion_principle.high_lvl.Switch;
import depdendecy_inversion_principle.high_lvl.Switchable;
import depdendecy_inversion_principle.low_lvl.Fan;
import depdendecy_inversion_principle.low_lvl.Lightbulb;

/*
* Dependency inversion principle - states that entities must depend on abstractions and not on concretions
* the goal is to reduce dependencies on concrete classes
*
* Abstraction should not depend upon details. details should depend upon abstractions
* High lvl classes mut not depend on the low lvl classes
*   both high-lvl classes and low-lvl classes should depend upon abstractions
*   the lower-lvl class impl is accessible to higher-lvl classes via an abstract interface
*   actual implementation of lower lvl class can then vary
*
* The inversion in the name of dependency inversion principle is there because it inverts the way you typically might think about your oo design
* dependency inversion provides loose coupling between higher and lower lvl classes by introducing an abstraction layer
*
* OO guidelines for adhering to DIP
* no variable should hold a reference to a concrete class
*   use a factory design pattern to avoid this
*
* no class should subclass from a concrete class
*   if you subclass from a concrete class, you are depending on a concrete class
*   subclass from an abstraction (an interface or an abstract class)
*
* */
public class ElectricPowerSwitchTest {
    public static void main(String[] args) {
        Switchable switchableBulb = new Lightbulb(); // this is the light bulb
        Switch bulbPowerSwitch = new ElectricPowerSwitch(switchableBulb); // the power switch of the light bulb
        bulbPowerSwitch.press();
        bulbPowerSwitch.press();

        Switchable switchableFan = new Fan(); // this is the switchable fan
        Switch fanPowerSwitch = new ElectricPowerSwitch(switchableFan);
        fanPowerSwitch.press();
        fanPowerSwitch.press();
    }
}
