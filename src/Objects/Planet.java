package Objects;
import java.awt.*;


public class Planet {
    public String name;
    public double mass;
   public double x;
   public double y;
    //position (x,y) and velocity (vx,vy) of the planet
    //velocity is in units of km/s, position is in units of km from the sun
    public double vx;
    public double vy;
    public Color color;
    public Planet(String name, Color color, double mass, double x, double y, double vx, double vy) {
        this.name = name;
        this.color = color;
        this.mass = mass;
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;

    
    
    }
    public double getMass() {
        return mass;
    }
    public Color getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public double getVx() {
        return vx;
    }

    public double getVy() {
        return vy;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

}
