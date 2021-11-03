/*
Name: Danny Roubin
Class: CSS 143 Sec B
Assignment: Shape inheritance assignment

Purpose of this file/class is to draw out a circle
~One of my lab classes
*/
import java.awt.*;
public class Circle extends Shape {

    private int radius;

    
    // constructor that takes in x, y, and a radius
    public Circle(int x, int y, int radius) {
        super(x, y);
        if (radius <= 0) {
            // checks to see if the radius is greater than 0
            System.out.println("values must be greater than 0");
        } else {
            this.radius = radius;
        } 
    }

    // method to get the area using the formula PI(r^2)
    @Override
    public double getArea() {
        return (Math.PI*(radius*radius));
    }

    // paint method user to draw the circle out
    public void paint( Graphics g) {

        final int x = getX();
		final int y = getY();
        final int r = getRadius();
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor( Color.magenta );

        g2d.drawOval(x, y, r, r);
	}

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    
}
