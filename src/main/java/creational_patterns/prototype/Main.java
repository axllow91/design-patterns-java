package creational_patterns.prototype;

import java.util.ArrayList;
import java.util.List;


/*
* Prototype is a creational design pattern that allows cloning, even compex ones, without coupling to
* their specific classes.
* All prototype classes should have a common interface that makes it possible to copy objects even if their concrete classes are unknown.
* Prototype objects can produce full copies since objects of the same class can access each other’s private fields.
*  Problem

Say you have an object, and you want to create an exact copy of it.
* How would you do it? First, you have to create a new object of the same class.
* Then you have to go through all the fields of the original object and copy their values over to the new object.
* Nice! But there’s a catch. Not all objects can be copied that way because some of the object’s fields may be private
* and not visible from outside of the object itself.
*
* */
public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 15;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);

        shapes.stream().forEach(System.out::println);
        shapesCopy.stream().forEach(System.out::println);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        // clone all shapes
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for(int i = 0; i < shapes.size(); i++) {
            if(shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + " Shapes are different objects (yey!)");
                if(shapes.get(i).equals(shapesCopy.get(i)))
                    System.out.println(i + " And they are identical copy!");
                else
                    System.out.println(i + " But they are not identical");
            } else {
                System.out.println(i  + " Shape objects are the same");
            }
        }
    }
}
