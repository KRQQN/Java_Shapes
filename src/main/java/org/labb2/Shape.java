package org.labb2;

import org.jetbrains.annotations.NotNull;

public abstract class Shape implements Comparable<Shape> {

    public abstract double getArea();
    public abstract double getPerimeter();
    private static int shapesMade;
    public Shape() {
        shapesMade++;
    }

    @Override
    public int compareTo(Shape other){
        return Double.compare(this.getArea(), other.getArea());
    }

    public static Shape add (@NotNull String shape, int param, int... params) {

        switch (shape) {

            case "Circle" -> {
                return new Circle(param);
            }
            case "Rectangle" -> {
                return new Rectangle(param, params[0]);
            }
            default -> System.out.println("No shape matching argument " + shape);

        }
        return null;
    }

    protected String numFormater(int num){
        String redColor = "\u001B[31m";
        String resetColor = "\u001B[0m";

        return redColor + (num > 3
                ? num + "th"
                : num == 3
                    ? num + "rd"
                    : num == 2
                        ? num + "nd"
                        : num + "st") +resetColor;
    }

    public static int getShapesMade() {
        return shapesMade;
    }




}



