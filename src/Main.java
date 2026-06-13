import Objects.Planet;
import Render.SimPanel;
import Simulation.simulationEngine;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
public class Main {
    public static void main(String[] args) throws InterruptedException {
Planet mercury = new Planet("Mercury", Color.lightGray, 3.285e23, -5.7909e10, 0, 0, 47400);
Planet venus = new Planet("Venus", Color.orange, 4.867e24, -1.0821e11, 0, 0, 35000);
Planet earth = new Planet("Earth", Color.green, 5.972e24, -1.496e11, 0, 0, 29800);
Planet mars = new Planet("Mars", Color.red, 6.39e23, -2.279e11, 0, 0, 24100);
Planet jupiter = new Planet("Jupiter", Color.orange, 1.898e27, -7.783e11, 0, 0, 13100);
Planet saturn = new Planet("Saturn", Color.yellow, 5.683e26, -1.427e12, 0, 0, 9700);
Planet uranus = new Planet("Uranus", Color.cyan, 8.681e25, -2.871e12, 0, 0, 6800);
Planet neptune = new Planet("Neptune", Color.blue, 1.024e26, -4.498e12, 0, 3210, 5400);
Planet sun = new Planet("Sun", Color.yellow, 1.989e30, 0, 0, 0, 0);
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

    Scanner scanner = new Scanner(System.in);
    System.out.println("Would you like to add a planet? (Y/N)");
    String answer = scanner.nextLine();
    if (answer.equalsIgnoreCase("y")) {
        System.out.println("Would you like high mass (Sun), Medium mass (Earth) , or Low mass (Mercury)? (H/M/L)");
       String massX = scanner.nextLine();
            double massY = 0;
            if (!massX.equalsIgnoreCase("H")&&
                !massX.equalsIgnoreCase("L")){
                    while (!massX.equalsIgnoreCase("H")&&
                    !massX.equalsIgnoreCase("m")&&
                    !massX.equalsIgnoreCase("L")){
                        System.out.println("Please try again (H/M/L)");
                        massX = scanner.nextLine();
                }
            }
            if (massX.equalsIgnoreCase("H")){
                massY = 1.989e30;
            }
            if (massX.equalsIgnoreCase("M")){
                massY = 5.972e24;
            }
            if (massX.equalsIgnoreCase("L")){
                massY = 3.285e23;
            }
           
            
             System.out.println("Planet Created");
            System.out.println(massY);
            Planet userPlanet = new Planet("X", Color.black, massY ,-5.8362e11, 0, 0, 6000 );
            planets.add(userPlanet);
         }
                System.out.println(String.valueOf(planets.size()));
                
    

    scanner.close();
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
        engine.applyGravity(planets, 3000);
        engine.movePlanets(planets, 3000);
        }
        panel.repaint();
        Thread.sleep(16);
    }
        
        
    }


}

