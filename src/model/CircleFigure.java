package model;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.awt.Color;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class CircleFigure extends AbstractFigure{
    protected int x;
    protected int y;
    protected int height;
    protected int width;
<<<<<<< Updated upstream:src/model/CircleFigure.java
    protected  Color color;
=======
    protected Color color;
>>>>>>> Stashed changes:src/main/java/model/CircleFigure.java


    public CircleFigure(int x, int y, int radius, Color color){
        this.x = x;
        this.y = y;
        this.height = radius;
        this.width = radius;

        this.color = (color);
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int getHeight(){
        return this.height;
    }

    public int getWidth(){
        return this.width;
    }
    @Override
    public float getArea() {
        return (float) (Math.PI * Math.sqrt(width));
    }

    @Override
    public float getPerimeter() {
        return (float) (2 * Math.PI * width);
    }

    @Override
    public int[] getXCoordinates() {
        return new int[] {x-width, x, x+width};
    }

    @Override
    public int[] getYCoordinates() {
        return new int[] {y-width, y, y+width};
    }

    @Override
    public Color getColor() {
        return color;
    }

}
