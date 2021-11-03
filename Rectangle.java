/*
Name: Danny Roubin
Class: CSS 143 Sec B
Assignment: Shape inheritance assignment

Purpose of this file/class is to draw out a square by experimenting with the fill3DRect method
~One of my homework classes
*/
import java.awt.*;
public class Rectangle extends Shape{
    private int height, width;

    // constructor taking in the x and y, as well as the width and height
    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        // checks to make sure that both the width and height are greater than zero
        if (width <= 0 || height <= 0)  {
            System.out.println("values must be greater than 0");
        } else {
            this.width = width;
            this.height = height;
        }
    }


    // simple method that gets the area using square area formula of length * height
    @Override
    public double getArea() {
        return (this.width * this.height);
    }

    // method that allows me to draw out the rectangle
    public void paint(Graphics g) {
        final int x = getX();
        final int y = getY();
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.orange);
        g2d.fill3DRect(x, y, 200, 100, false);
    }

    // getter for the height of the rectangle
    public int getHeight() {
        return this.height;
    }

    // getter for the width of the rectangle
    public int getWidth() {
        return this.width;
    }

    // sets the height
    public void setHeight(int height) {
        this.height = height;
    }

    // setter for the width
    public void setWidth(int width) {
        this.width = width;
    }
    
}
