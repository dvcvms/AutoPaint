package windows;

import model.CircleFigure;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class CircleWindow extends JFrame {

    private final CircleFigure circle = new CircleFigure(100, 100, 100, new Color(10, 38, 73));
    private final int height = 300;
    private final int width = 300;

    public CircleWindow() {
        super("Круг");
        setSize(width, height);
        setLocationRelativeTo(null);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(circle.getColor());

        g2.fill(new Ellipse2D.Float(circle.getX(), circle.getY(), circle.getWidth(), circle.getHeight()));
        g2.dispose();
        getContentPane();

    }
}
