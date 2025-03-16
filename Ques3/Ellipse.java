package Ques3;

import Ques4.Scalable;

//ellipse is a shape, and it is scalable. it can move, change size, etc
public class Ellipse extends Shape implements Scalable {
    private final double a, b;
    public Ellipse(double a, double b) {
        super("Ellipse"); //calls to shape to get and determine the name to store in memory
        this.a = Math.max(a, b);
        this.b = Math.min(a, b);
    }

    @Override
    public double getArea() { return Math.PI * a * b; }

    @Override
    public double getPerimeter() { return Math.PI * 2 * (a + b - Math.sqrt((a - b) * (a - b))); }

    @Override
    public void scale(double factor) {
        System.out.println("Cannot modify final values of a and b!");
    }
}