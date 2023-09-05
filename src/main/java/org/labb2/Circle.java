package org.labb2;

import java.util.Objects;

public class Circle extends Shape {
    private double radius;
    private static int circleInstances;
    private final int createdOrder;

    public Circle(Integer diameter) {
        this.radius = (double) diameter / 2;
        this.createdOrder = circleInstances +1;
        circleInstances++;
    }

    @Override
    public String toString() {
        return "Circle with area: " + this.getArea() +
                "\n" + numFormater(createdOrder) + " circle to be made.\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(radius, circle.radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }


    @Override
    public double getArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return Double.parseDouble( String.format("%.2f", area) );
    }

    @Override
    public double getPerimeter() {
        return (Math.pow(Math.PI, 2)) * radius;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public void setDiameter(double diameter) {
        this.radius = diameter/2;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


}
                                    