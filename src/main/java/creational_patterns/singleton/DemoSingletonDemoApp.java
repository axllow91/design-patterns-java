package creational_patterns.singleton;

import com.google.common.collect.Iterables;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DemoSingletonDemoApp {
    private static int instanceCount = 0;
    private final Map<String, Integer> capitals = new Hashtable<>();

    private DemoSingletonDemoApp() {
        instanceCount++;
        System.out.println("Initializing database");

        try {
            File f = new File(getClass().getResource("capitals.txt").getPath());
            Path fullPath = Paths.get(f.getPath(), "capitals.txt");
            List<String> lines = Files.readAllLines(fullPath);

            Iterables.partition(lines, 2)
                    .forEach(kv -> capitals.put(
                            kv.get(0).trim(),
                            Integer.parseInt(kv.get(1))
                    ));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static final DemoSingletonDemoApp INSTANCE =
            new DemoSingletonDemoApp();

    public static int getInstanceCount() {
        return instanceCount;
    }

    public static DemoSingletonDemoApp getInstance() {
        return INSTANCE;
    }

    public int getPopulation(String name) {
        return capitals.get(name);
    }



    public static void main(String[] args) {

    }

}

class SingletonRecordFinder {
    public int getTotalPopulation(List<String> names) {
        int result = 0;
        for(String name : names) {
            result+= DemoSingletonDemoApp.getInstance().getPopulation(name);
        }
        return result;
    }
}

class Tests {
    @Test
    public void singletonTotalPopulationTest() {
       SingletonRecordFinder rf =  new SingletonRecordFinder();
       List<String> names = List.of("Seoul", "Mexico City");
       int tp = rf.getTotalPopulation(names);
       assertEquals(1750000+1740000, tp);
    }
}
