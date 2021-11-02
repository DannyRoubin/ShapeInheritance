import java.awt.*;
public class Square extends Shape {

    private int sideLength;

    public Square(int x, int y, int sideLength) {
        super(x, y);
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return (sideLength*sideLength);
    }

    public int getSideLength() {
        return this.sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    public void paint( Graphics g) {

        final int x = getX();
		final int y = getY();
        final int s = getSideLength();
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor( Color.BLUE );

        g2d.drawRect(x, y, s, s);
	}
    
}
