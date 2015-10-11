package service;

public class Vector2d {
    private double x;
    private double y;

    public static Vector2d zero(){
        return new Vector2d(0, 0);
    }

    public Vector2d(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double x() {
        return x;
    }

    public double y() {
        return y;
    }

    public void scale(double scale) {
        x *= scale;
        y *= scale;
    }

    public void add(Vector2d that) {
        this.x += that.x;
        this.y += that.y;
    }
}
