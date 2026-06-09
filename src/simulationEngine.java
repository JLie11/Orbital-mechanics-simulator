import utilities.Planet;

public class simulationEngine {
    boolean running;
    
    public void start() {
        running = true;
        while (running) {
            update();
    
}
    }
    public void update() {
        //update the positions and velocities of the planets
    }
    public double Gravity(Planet p1, Planet p2) {
        double G = 6.67430e-11; // gravitational constant
        double dx = p2.getX() - p1.getX();
        double dy = p2.getY() - p1.getY();
        double r = Math.hypot(dx, dy);
        return G * p1.getMass() * p2.getMass() / (r * r);
    }

    public double accelerationX(Planet p1, Planet p2) {
        double dx = p2.getX() - p1.getX();
        double dy = p2.getY() - p1.getY();
        double r = Math.hypot(dx, dy);
        double a = Gravity(p1, p2) / p1.getMass(); 
        return a * (dx/r);
       
    }
     public double accelerationY(Planet p1, Planet p2) {
        double dx = p2.getX() - p1.getX();
        double dy = p2.getY() - p1.getY();
        double r = Math.hypot(dx, dy);
        double a = Gravity(p1, p2) / p1.getMass(); 
        return a * (dy/r);
       
    }
    

    public void applyGravity(Planet p1, Planet p2) {
        // apply gravity should compute accelerations on both bodies
        double ax = accelerationX(p1, p2);
        double ay = accelerationY(p1, p2);
        //change dt once loop is made
        double dt = 5;
        p1.vx += ax * dt;
        p1.vy += ay * dt;
        p2.vx -= ax * dt;
        p2.vy -= ay * dt;
    }
    public void movePlanets(Planet p1, Planet p2) {
        double dt = 5;
        p1.x += p1.vx * dt;
        p1.y += p1.vy * dt;
        p2.x += p2.vx * dt;
        p2.y += p2.vy * dt;
    }
}