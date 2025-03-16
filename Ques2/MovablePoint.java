package Ques2;

public class MovablePoint extends Point {
    //extends to point as this class makes "Point" movable

    //speed is a float because it can be something like 1.5; it is not limited to an integer value
    private final float xSpeed, ySpeed;
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y); // calls to Point to get X and Y
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public void move() { //main function for setting, getting and moving the point at set speed
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
    }
    //output to string
    @Override
    public String toString() {
        return super.toString() + " Speed: (" + xSpeed + ", " + ySpeed + ")";
    }
}