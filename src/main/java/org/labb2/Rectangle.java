package org.labb2;

import java.util.Objects;

public class Rectangle extends Shape {
    private double x;
    private double y;
    private static int rectangleInstances =1;
    private final int createdOrder;

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
        this.createdOrder = rectangleInstances;
        rectangleInstances++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(x, rectangle.x) == 0 && Double.compare(y, rectangle.y) == 0;
    }

    @Override
    public String toString() {
        return "Rectangle with area: " + this.getArea() +
                "\n" + numFormater(createdOrder) + " rectangle to be made.\n";
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public double getArea() {
        return x * y;
    }

    @Override
    public double getPerimeter() {
        return (x*2) + (y*2);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
