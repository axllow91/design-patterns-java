package creational_patterns.singleton.mono_state_singleton;

// even we make a number of instances of this class
// we can share only a common storage element because of the static members
// is a singleton only for the data storage (they share data between the same instances) not that safe and kinda complicated
public class ChiefExecutive {
    private static String name;
    private static int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        ChiefExecutive.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        ChiefExecutive.age = age;
    }

    @Override
    public String toString() {
        return "ChiefExecutive{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        ChiefExecutive chief = new ChiefExecutive();
        chief.setName("Adam");
        chief.setAge(554);

        // already initialized
        ChiefExecutive chief2 = new ChiefExecutive();
        System.out.println(chief2);

    }
}


