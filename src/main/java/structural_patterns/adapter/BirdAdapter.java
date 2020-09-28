package structural_patterns.adapter;

public class BirdAdapter implements ToyDuck {
    // You need to implement the interface your
    // client expects to use.
    Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void squeak() {
        bird.makeSound();
    }
}
