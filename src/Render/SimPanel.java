package Render;
import Objects.Planet;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class SimPanel extends JPanel {
    ArrayList<Planet> planets;

    public SimPanel(ArrayList<Planet> planets) {
        this.planets = planets;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Planet p : planets) {
        int screenX = (int)(p.x / 1e10 + 500);
        int screenY = (int)(p.y / 1e10 + 500);  
            g.setColor(p.getColor());
            g.fillOval(screenX, screenY, 10, 10);
        }
    }
}