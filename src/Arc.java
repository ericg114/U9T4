import java.awt.*;

public class Arc extends Shape{

    private int StarAngle;
    private int ArcAngle;


    public Arc()
    {
        super();
        StarAngle = 70;
        ArcAngle = 30;
    }
    @Override
    public void draw(Graphics g)
    {
        // set the color to draw the shape in
        g.setColor(getColor());

        // draw the oval given the top left corner of the enclosing
        // rectangle and the width and height
        g.drawOval(getMinX(), getMinY(), getWidth(), getHeight(), StarAngle, ArcAngle); // the getter methods here are INHERITED FROM SHAPE!
    }
}
