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
        double softening = 1e9; // 1 million km buffer
        double gravForce = G * p1.getMass() * p2.getMass() / (r * r + softening * softening);
        double a = gravForce / p1.getMass(); 
        double ax = a * (dx/r);
        double ay = a * (dy/r);
        p1.vx += ax * dt;
        p1.vy += ay * dt;
        p2.vx -= ax * dt;
        p2.vy -= ay * dt;
       
}}}
public void movePlanets(ArrayList<Planet> planets,double dt){
        for(int n = 0; n <= 8; n++){
            Planet p1 = planets.get(n);
            p1.x += p1.vx * dt;
            p1.y += p1.vy * dt;
}}}