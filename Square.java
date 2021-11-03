/*
Name: Danny Roubin
Class: CSS 143 Sec B
Assignment: Shape inheritance assignment

Purpose of this file/class is to draw out a square
~One of my lab classes
*/

import java.awt.*;
public class Square extends Shape {

    private int sideLength;

    // constructor that takes in x, y, and a side length
    public Square(int x, int y, int sideLength) {
        super(x, y);
        // checks to see if the side length is greater than 0
        if (sideLength <= 0 ) {
            System.out.println("values must be greater than 0");
        } else {
            this.sideLength = sideLength;
        }
    }

    // method to get the area, since this is a square it is a simple side length * side length
    @Override
    public double getArea() {
        return (sideLength*sideLength);
    }

    // getter for the side length
    public int getSideLength() {
        return this.sideLength;
    }

    // setter for the sideLength
    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    // paint method which draws out the square
    public void paint( Graphics g) {

        final int x = getX();
		final int y = getY();
        final int s = getSideLength();
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor( Color.BLUE );

        g2d.drawRect(x, y, s, s);
	}
    
}
