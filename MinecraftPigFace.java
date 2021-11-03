/*
Name: Danny Roubin
Class: CSS 143 Sec B
Assignment: Shape inheritance assignment

Purpose of this file/class is to draw out the face of a pig from minecraft
~One of my homework classes
*/
import java.awt.*;
public class MinecraftPigFace extends Shape{

    // constructor for the pig face, only takes in an x and y coordinates since all other points must remain the same
    public MinecraftPigFace(int x, int y) {
        super(x, y);
    }

    // simple get area, since the pig face is a big squa
    public double getArea() {
        return (150*150);
    }

    // method to draw out the pig face
    public void paint( Graphics g) {
        // making a couple new colors to best match the pig face colors
        Color pigNose = new Color(254,193,191);
        Color pigNostril = new Color(255,143,142);

        // setting the x and y coordinates
        final int x = getX();
		final int y = getY();

        // making the general outline of the pigs face
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor( Color.pink );
        g2d.fillRect(x, y, 150, 150);

        // setting black portion of pigs eyes
        g2d.setColor(Color.black);
        g2d.fillRect(x, y + 60, 25, 25);
        g2d.fillRect(x + 125, y + 60, 25, 25);
        
        //setting white portion of pigs eyes
        g2d.setColor(Color.white);
        g2d.fillRect(x+25, y + 60, 25, 25);
        g2d.fillRect(x + 100, y + 60, 25, 25);

        // setting the light pink backdrop of the pigs nose
        g2d.setColor(pigNose);
        g2d.fillRect(x + 40, y + 95, 70, 30);

        // setting the two nostrils
        g2d.setColor( pigNostril);
        g2d.fillRect(x + 40, y + 100, 15, 15);
        g2d.fillRect(x + 95, y + 100, 15, 15);

    }
    
}
