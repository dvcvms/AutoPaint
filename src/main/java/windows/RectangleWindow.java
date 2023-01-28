package windows;

import model.Rectangle;

import javax.swing.*;
import java.awt.*;

public class RectangleWindow extends JFrame {

    private final Rectangle rect = new Rectangle(50, 50, 200, 100, new Color(187, 38, 73));

    public RectangleWindow() {
        super("Дмитрий Поздеев");
        int width = 2 * rect.getX() + rect.getWidth();
        int height = 2 * rect.getY() + rect.getHeight();
        setSize(width, height);
        setLocationRelativeTo(null);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(rect.getColor());
        g.fillRect(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
    }
}
