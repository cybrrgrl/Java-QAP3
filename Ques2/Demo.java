package Ques2;

public class Demo {
    public static void main(String[] args) {
        MovablePoint p = new MovablePoint(2.0f, 3.0f, 1.5f, -1.0f);
        System.out.println("Before moving: " + p);
        p.move();
        System.out.println("After moving: " + p);
    }
}