package service;

public class Vector2d {
    public final static Vector2d zero = new Vector2d(0, 0);
    private double x;
    private double y;

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
