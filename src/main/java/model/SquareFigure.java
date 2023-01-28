package model;
import java.awt.*;

import lombok.*;

@ToString(of = {"x","y"})
@EqualsAndHashCode(of = {"x", "y"}, callSuper = false)
@NoArgsConstructor
@RequiredArgsConstructor
public class SquareFigure extends AbstractFigure {
    @NonNull
    private int[] x;
    @NonNull
    private int[] y;
    private int[] rgb = new int[4];
    @Override
    public int[] getXCoordinates() {
        return x;
    }

    @Override
    public int[] getYCoordinates() {
        return y;
    }

    @Override
    public Color getColor() {
        for (int i = 0; i < 4; i++) {
            rgb[i] = (x[i] + y[i]) % 255;
        }
        return new Color(rgb[0], rgb[1], rgb[2], rgb[3]);
    }

    @Override
    public float getArea() {
        return (float) Math.pow((x[3]-x[0]),2);
    }

    @Override
    public float getPerimeter() {
        return ((x[3]-x[0])+(y[1]-y[0]))*2;
    }

}
