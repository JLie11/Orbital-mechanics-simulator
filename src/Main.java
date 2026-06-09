import Objects.Planet;
import Render.SimPanel;
import Simulation.simulationEngine;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.*;
public class Main {
    public static void main(String[] args) throws InterruptedException {
Planet mercury = new Planet("Mercury", Color.lightGray, 3.285e23, 2439.7, 4.9368e10, -3.2912e10, 15000, 42000);
Planet venus = new Planet("Venus", Color.orange, 4.867e24, 6051.8, -8.0784e10, -7.0312e10, 27000, -20000);
Planet earth = new Planet("Earth", Color.green, 5.972e24, 6371, 1.496e11, 3.2912e10, -4500, 29500);
Planet mars = new Planet("Mars", Color.red, 6.39e23, 3389.5, 2.06448e11, -1.40624e11, 16000, 22000);
Planet jupiter = new Planet("Jupiter", Color.orange, 1.898e27, 69911, -7.1808e11, 3.8896e11, -7000, -11000);
Planet saturn = new Planet("Saturn", Color.yellow, 5.683e26, 58232, 1.07712e12, 8.8264e11, -6500, 7200);
Planet uranus = new Planet("Uranus", Color.cyan, 8.681e25, 25362, -2.66288e12, -9.1256e11, 2000, -5800);
Planet neptune = new Planet("Neptune", Color.blue, 1.024e26, 24622, 4.27856e12, -1.4212e12, 1400, 3400);
Planet sun = new Planet("Sun", Color.yellow, 1.989e30, 696340, 0, 0, 0, 0);
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
        engine.applyGravity(planets, 72);
        engine.movePlanets(planets, 72);
    }
        panel.repaint();
        Thread.sleep(16);
    }
        
        
    }


    }
