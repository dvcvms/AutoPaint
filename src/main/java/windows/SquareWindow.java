package windows;

import model.SquareFigure;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;


public class SquareWindow  extends JFrame{
    private final int height = 300;
    private final int width = 300;

    public SquareWindow(){
        super("Чередник Арина Квадрат");
        setSize(width, height);
        setLocationRelativeTo(null);
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        SquareFigure squareFigure = new SquareFigure();
        Polygon square = new Polygon(squareFigure.getXCoordinates(), squareFigure.getYCoordinates(), 4);
        g2.setColor(squareFigure.getColor());
        g2.drawPolygon(square);
        g2.fill(square);

    }
}