package Objects;



public class Planet {
    String name;
    double mass;
    double radius;
   public double x;
   public double y;
    //position (x,y) and velocity (vx,vy) of the planet
    //velocity is in units of km/s, position is in units of AU
    public double vx;
    public double vy;
    public Planet(String name, double mass, double radius, double x, double y, double vx, double vy) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
    }
    public double density(){
        return mass / (4.0/3.0 * Math.PI * Math.pow(radius, 3));
    }
    public double getMass() {
        return mass;
    }

    public String getName() {
        return name;
    }

    public double getRadius() {
        return radius;
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
