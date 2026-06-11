package Simulation;
import Objects.Planet;
import java.util.ArrayList;
public class simulationEngine {    
public void applyGravity(ArrayList<Planet> planets, double dt){
for (int i = 0; i < planets.size(); i++){
    for (int j = i + 1; j < planets.size(); j++){
        Planet p1 = planets.get(i);
        Planet p2 = planets.get(j);
        double G = 6.67430e-11; // gravitational constant
        double dx = p2.getX() - p1.getX();
        double dy = p2.getY() - p1.getY();
        double r = Math.hypot(dx, dy);
        double gravForce = G *p1.getMass() * p2.getMass()/ (r * r);
        double a1 = gravForce / p1.getMass(); 
        double a2 = gravForce / p2.getMass();
        double ax1 = a1 * (dx/r);
        double ay1 = a1 * (dy/r);
        double ax2 = a2 * (dx/r);
        double ay2 = a2 * (dy/r);
        p1.vx += ax1 * dt;
        p1.vy += ay1 * dt;
        p2.vx -= ax2 * dt;
        p2.vy -= ay2 * dt;
       
}}}
public void movePlanets(ArrayList<Planet> planets,double dt){
      for(int n = 0; n < planets.size(); n++){
            Planet p1 = planets.get(n);
            p1.x += p1.vx * dt;
            p1.y += p1.vy * dt;

} 
}}