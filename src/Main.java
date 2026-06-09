import Objects.Planet;
import Render.SimPanel;
import java.util.ArrayList;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Program started.");
        Planet mercury = new Planet("Mercury", 3.285e23, 2439.7, 0.33,-0.22, 15, 42);
        Planet venus = new Planet("Venus", 4.867e24, 6051.8, -0.54, -0.47, 27, -20);
        Planet earth = new Planet("Earth", 5.972e24, 6371, 1, 0.22, -4.5, 29.5);
        Planet mars = new Planet("Mars", 6.39e23, 3389.5, 1.38, -.94, 16, 22);
        Planet jupiter = new Planet("Jupiter", 1.898e27, 69911, -4.8, 2.6, -7, -11);
        Planet saturn = new Planet("Saturn", 5.683e26, 58232,7.2, 5.9, -6.5, 7.2);
        Planet uranus = new Planet("Uranus", 8.681e25, 25362, -17.8, -6.1, 2, -5.8);
        Planet neptune = new Planet("Neptune", 1.024e26, 24622, 28.6, -9.5, 1.4, 3.4);
        Planet sun = new Planet("Sun", 1.989e30, 696340, 0, 0, 0, 0);
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
        JFrame frame = new JFrame("Solar System");
SimPanel panel = new SimPanel(planets);
frame.add(panel);
frame.setSize(800, 800);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);

    }
}