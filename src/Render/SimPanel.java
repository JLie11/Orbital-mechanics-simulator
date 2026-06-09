package Render;
import Objects.Planet;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class SimPanel extends JPanel {
    ArrayList<Planet> planets;

    public SimPanel(ArrayList<Planet> planets) {
        this.planets = planets;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Planet p : planets) {
            int screenX = (int)(p.x * 100 + 400);
            int screenY = (int)(p.y * 100 + 400);
            g.fillOval(screenX, screenY, 10, 10);
        }
    }
}