package creational_patterns.factory_method;

public class Duck implements Animal {
    @Override
    public void speak() {
        System.out.println("Duck says Quack quack");
    }
}
