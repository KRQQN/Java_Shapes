package org.labb2;
import java.util.ArrayList;
import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        ArrayList<Shape> randomShapes = randomShapeMaker(7);
        HashSet<Shape> uniqueShapes = new HashSet<>();

        // Unsorted Arraylist of Shapes
        System.out.println("############ UNSORTED ############");
        randomShapes.forEach(System.out::println);

        // Sorted ArrayList compared with an override of Comparable-interface "compareTo()"
        System.out.println("\n######### SORTED BY AREA #########");
        randomShapes.stream()
                .sorted()
                .forEach(System.out::println);

        // HashSet with unique shapes. works by overriding .equals() & .hashCode() from Object.
        System.out.println("########## UNIQUE OBJECTS ############");
        uniqueShapes.add(new Circle(6));
        uniqueShapes.add(new Circle(6));
        uniqueShapes.add(new Circle(6));
        uniqueShapes.add(new Circle(3));
        uniqueShapes.add(new Circle(3));
        uniqueShapes.add(new Circle(2));
        uniqueShapes.add(new Circle(1));

        uniqueShapes.forEach(set -> System.out.println(set.toString()));


        // implemented a counter for the abstract class with its constructor.
        // but better approach needed or better name for method since its accesible via Circle.getShapesMade()
        // and that will get the amount of all shape-subclass instances created.
        System.out.println("#############################");
        System.out.println("Total amount of shapes created: " + Shape.getShapesMade());

    }

    // A function that creates x-amount of random shapes, with random values to populate the ArrayList
    public static ArrayList<Shape> randomShapeMaker(Integer amountOfShapes) {
        String[] shapes = {"Circle", "Rectangle"};
        ArrayList<Shape> listOfShapes = new ArrayList<>(amountOfShapes);

        for (int i = 0; i < amountOfShapes; i++) {
            int randomIndex = (int) (Math.random() * shapes.length);
            int randomInt = (int) (Math.random() * 20) + 1;
            int randomInt2 = (int) (Math.random() * 20) + 1;

            listOfShapes.add(Shape.add(shapes[randomIndex], randomInt, randomInt2));
            System.out.println();
        }
        return listOfShapes;

    }
}

