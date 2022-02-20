package creational.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class DemoPrototype {

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        var circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        var anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        var rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        shapes
                .stream()
                .map(Shape::clone)
                .forEach(shapesCopy::add);

        IntStream
                .range(0, shapes.size())
                .forEach(i -> {
                    if (shapes.get(i) != shapesCopy.get(i)) {
                        System.out.println(i + ": Shapes are different objects (yay!)");
                        if (shapes.get(i).equals(shapesCopy.get(i))) {
                            System.out.println(i + ": And they are identical (yay!)");
                        } else {
                            System.out.println(i + ": But they are not identical (booo!)");
                        }
                    } else {
                        System.out.println(i + ": Shape objects are the same (booo!)");
                    }
                });
    }

}
