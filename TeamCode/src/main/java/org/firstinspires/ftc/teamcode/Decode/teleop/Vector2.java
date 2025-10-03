package org.firstinspires.ftc.teamcode.Decode.teleop;

public class Vector2 {
    private double x;
    private double y;

    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public Vector2 getVector() {
        return new Vector2(this.x, this.y);
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setVector(Vector2 vector) {
        this.x = vector.getX();
        this.y = vector.getY();
    }

    public double getMagnitude
}
