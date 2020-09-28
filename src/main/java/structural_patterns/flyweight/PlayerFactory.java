package structural_patterns.flyweight;

import java.util.HashMap;


// Class used to get a player using HashMap (Returns
// an existing player if a player of given type exists.
// Else creates a new player and returns it.
public class PlayerFactory {

    // HashMap stores the reference to the object
    // of Terrorist(TS) or CounterTerrorist(CT).
    private static HashMap<String,Player> hPlayers = new HashMap<>();

    // method to get a player
    public static Player getPlayer(String type) {
        Player p = null;

        if(hPlayers.containsKey(type))
            p = hPlayers.get(type);
        else {
            // create an object of T or CT
            switch (type) {
                case "Terrorist":
                    System.out.println("Terrorist Created");
                    p = new Terrorist();
                    break;
                case "CounterTerrorist":
                    System.out.println("CounterTerorist Created");
                    p = new CounterTerrorist();
                    break;
                default:
                    System.out.println("Unreachable code!");
            }

            hPlayers.put(type, p);
        }
        return p;
    }


}
