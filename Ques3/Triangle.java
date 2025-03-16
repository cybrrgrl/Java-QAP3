package Ques3;

// we are importing the scalable class because this is a shape, and again it is scalable so it can move and change sides
import Ques4.Scalable;
public class Triangle extends Shape implements Scalable {
    private double side1, side2, side3; //double to allow decimal values
    public Triangle(double s1, double s2, double s3) {
        super("Triangle"); //calls to shape to get the name
        if (s1 + s2 > s3 && s2 + s3 > s1 && s3 + s1 > s2) {
            this.side1 = s1;
            this.side2 = s2;
            this.side3 = s3;
        } else {
            throw new IllegalArgumentException("Invalid triangle sides");
        }
    }

    @Override
    public double getPerimeter() { return side1 + side2 + side3; }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    @Override
    public void scale(double factor) {
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }
}