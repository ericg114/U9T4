import java.awt.*;

    public class Hexagon extends Shape {
        /**
         * Constructor
         */
        public Hexagon() {
            super();  // call parent constructor (note the parent's constructor has no parameters)
        }

        @Override
        public void draw(Graphics g) {
            // set the color
            g.setColor(getColor());

            // draw the rectangle given the top left point and width and height
            g.drawHex(getMinX(), getMinY(), getWidth(), getHeight()); // the getter methods here are INHERITED FROM SHAPE!
        }
    }


