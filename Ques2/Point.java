package Ques2;

public class Point {
    //sets X and Y accordingly so movablepoint can get a starting position
    private float x, y;
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    //lets movablepoint read where starting is
    public float getX() { return x; }
    public float getY() { return y; }
    public void setX(float x) { this.x = x; }
    public void setY(float y) { this.y = y; }
    @Override
    public String toString() { return "(" + x + ", " + y + ")"; }
}