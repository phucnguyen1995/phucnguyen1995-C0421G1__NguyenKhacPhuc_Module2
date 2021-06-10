package _06_ke_thua.baitap;

public class MovablePoint extends Point {
    private float xSpeed=2.0f;
    private float ySpeed=3.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
     public MovablePoint() {

     }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }
    public float[] getSpeed() {
        return new float[] {getxSpeed(),getySpeed()};
    }

    @Override
    public String toString() {
        return "(x,y) = " + "(" + getX() + "," + getY() + ")" + ", speed = " + "(" + this.xSpeed + "," + this.ySpeed + ")";
    }

    public void move() {
        this.setX(getX()+getxSpeed());
        this.setY(getY()+getySpeed());

    }
}
