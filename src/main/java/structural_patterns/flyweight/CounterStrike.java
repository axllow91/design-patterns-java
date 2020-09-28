package structural_patterns.flyweight;

import java.util.Random;

// Driver class
public class CounterStrike {
    // All players types and weapons (use by getRandomPlayerType())
    // and getRandom()
    private static final String[] playerType = {"Terrorist", "CounterTerrorist"};
    private static final String[] weapons = {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};
    private static final Random random = new Random();

    public static String getRandomPlayerType() {
        int intRandom = random.nextInt(playerType.length);
        return playerType[intRandom];
    }

    public static String getRandomWeapon() {
        int intRandom = random.nextInt(weapons.length);
        return weapons[intRandom];
    }

    public static void main(String[] args) {
        // Assume we have a total of 10 players in the game
        for (int i = 0; i < 10 ; i++) {
            /* getPlayer() is called simply using the class
               name since the method is a static one */
            Player p = PlayerFactory.getPlayer(getRandomPlayerType());

             /* Assign a weapon chosen randomly uniformly
               from the weapon array  */
            p.assignWeapon(getRandomWeapon());

            p.mission();
        }
    }
}
