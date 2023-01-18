package windows;

import model.Triangle;

import javax.swing.*;
import java.awt.*;

public class TriangleWindow extends JFrame {

    private final int width = 400;
    private final int height = 400;

    private final Triangle triangle;

    public TriangleWindow() throws HeadlessException {
        super("Triangle");

        int[] x = {200, 50, 350};
        int[] y = {50, 350, 350};
        this.triangle = new Triangle(x, y);

        setSize(width, height);
        setLocationRelativeTo(null);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(triangle.getColor());
        Polygon polygon = new Polygon(
                triangle.getXCoordinates(),
                triangle.getYCoordinates(),
                triangle.getNumber());

        g2.fillPolygon(polygon);
        g2.dispose();
    }
}
