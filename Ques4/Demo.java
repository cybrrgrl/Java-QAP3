package Ques4;

import Ques3.EquilateralTriangle;
import Ques3.Triangle;

//importing the triangles so we can get a scalable array

public class Demo {
    public static void main(String[] args) {
        Scalable[] shapes = {
            new Triangle(3.0, 4.0, 5.0), //assign the values to the triangle
            new EquilateralTriangle(6.0) //assign the values to the eqtriangle
        };

        //the before and after
        System.out.println("Before Scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }
        scaleShapes(shapes, 2.0);
        System.out.println("After Scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }
    }
    
    public static void scaleShapes(Scalable[] shapes, double factor) {
        for (Scalable shape : shapes) {
            shape.scale(factor);
        }
    }
}