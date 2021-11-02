import java.awt.*;
public class Circle extends Shape {
// test
// new test
    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (Math.PI*(radius*radius));
    }

    public void paint( Graphics g) {

        final int x = getX();
		final int y = getY();
        final int r = getRadius();
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor( Color.RED );

        g2d.drawOval(x, y, r, r);
	}

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    
}
