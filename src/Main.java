import Objects.Planet;
import Render.SimPanel;
import Simulation.simulationEngine;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.*;
public class Main {
    public static void main(String[] args) throws InterruptedException {
Planet mercury = new Planet("Mercury", Color.lightGray, 3.285e23, 2439700, -5.7909e10, 0, 0, 47400);
Planet venus = new Planet("Venus", Color.orange, 4.867e24, 6051800, -1.0821e11, 0, 0, 35000);
Planet earth = new Planet("Earth", Color.green, 5.972e24, 6371000, -1.496e11, 0, 0, 29800);
Planet mars = new Planet("Mars", Color.red, 6.39e23, 3389500, -2.279e11, 0, 0, 24100);
Planet jupiter = new Planet("Jupiter", Color.orange, 1.898e27, 69911000, -7.783e11, 0, 0, 13100);
Planet saturn = new Planet("Saturn", Color.yellow, 5.683e26, 58232000, -1.427e12, 0, 0, 9700);
Planet uranus = new Planet("Uranus", Color.cyan, 8.681e25, 25362000, -2.871e12, 0, 0, 6800);
Planet neptune = new Planet("Neptune", Color.blue, 1.024e26, 24622000, -4.498e12, 0, 3210, 5400);
Planet sun = new Planet("Sun", Color.yellow, 1.989e30, 696340000, 0, 0, 0, 0);
        ArrayList<Planet> planets = new ArrayList<>();
        planets.add(mercury);
        planets.add(venus);
        planets.add(earth);
        planets.add(mars);
        planets.add(jupiter);
        planets.add(saturn);
        planets.add(uranus);
        planets.add(neptune);
        planets.add(sun);
    simulationEngine engine = new simulationEngine();
        JFrame frame = new JFrame("Solar System");
SimPanel panel = new SimPanel(planets);
frame.add(panel);
frame.setSize(1000, 1000);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
    boolean running = true;
    while (running == true) {
        for (int b = 0; b<100; b++){
            //dt is speed, the higher the faster it is
        engine.applyGravity(planets, 6000);
        engine.movePlanets(planets, 6000);
    }
        panel.repaint();
        Thread.sleep(16);
    }
        
        
    }


    }
