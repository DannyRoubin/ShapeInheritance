/*
Name: Danny Roubin
Class: CSS 143 Sec B
Assignment: Shape inheritance assignment

Purpose of this file/class is to draw out a pokeball by primarily using .fillArc
~One of my homework classes
*/
import java.awt.*;
public class Pokeball extends Shape{

    // constructor for the pokeball that only takes an x and y since all other inputs must be very specific
    public Pokeball(int x, int y) {
        super(x, y);
    }

    // method that returns the area of the pokeball
    @Override
    public double getArea() { 
        // going to solve for area by viewing this pretty much like a circle since it essentially is a circle with a 10x7 line in the center
        // which we can solve for at the end and add
        double radius = 50; //set to 50 since the diameter is 100, so the radius is 50
        double temp = (Math.PI*(radius*radius)); //gets the area of the two arcs used
        temp += (10*7); //adds in the area of the line in the center
        return temp;
    }

    // method that draws out my pokeball
    public void paint(Graphics g) {
        final int x = getX();
        final int y = getY();
        Graphics2D g2d = (Graphics2D) g;
        // draws the top half
        g2d.setColor(Color.RED);
        g2d.fillArc(x, y, 100, 100, 0, 180);
        // draws the center line
        g2d.setColor(Color.BLACK);
        g2d.fillRect(x, y+50, 100, 7);
        // draws bottom half
        g2d.setColor(Color.WHITE);
        g2d.fillArc(x, y+7, 100, 100, 180, 180);
        // Outer center circle
        g2d.setColor(Color.BLACK);
        g2d.fillArc(x+28, y+30, 45, 45, 0, 360);
        // inner center circle
        g2d.setColor(Color.WHITE);
        g2d.fillArc(x+33, y+35, 35, 35, 0, 360);
        // next inner center circle
        g2d.setColor(Color.BLACK);
        g2d.fillArc(x+38, y+40, 24, 24, 0, 360);
        // final inner center circle
        g2d.setColor(Color.WHITE);
        g2d.fillArc(x+41, y+43, 18, 18, 0, 360);
        

    }
}
