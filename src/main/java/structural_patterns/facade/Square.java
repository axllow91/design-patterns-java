package structural_patterns.facade;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw a Square!");
    }
}
