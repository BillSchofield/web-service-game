package service;

import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static service.Vector2d.*;

public class Entity {
    private double rotationInRadians = 0;
    private Vector2d position;
    private Vector2d velocity = new Vector2d(0, 0);
    private Vector2d acceleration = new Vector2d(0, 0);

    public Entity(Vector2d position) {
        this.position = position;
    }

    public void rotate(double angleInDegrees) {
        rotationInRadians += Math.PI * angleInDegrees/360;
    }

    public void accelerate(){
        double amount = 0.02;
        Vector2d impulse = new Vector2d(sin(-rotationInRadians), cos(rotationInRadians));
        impulse.scale(amount);
        velocity.add(impulse);
    }

    public String position() {
        return position.x() + " " + position.y() + " " + rotationInRadians;
    }

    public void update() {
        velocity.add(acceleration);
        position.add(velocity);

    }

    public void reset() {
        acceleration = zero();
        velocity = zero();
        position = new Vector2d(200, 200);
    }
}
