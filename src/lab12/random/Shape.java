package lab12.random;
import java.awt.*;
abstract class Shape {
    protected Color color;
    protected int x, y;
    protected int width, height;
    public Shape(int x, int y, Color color, int height, int width) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.width = width;
        this.height = height;
    }

    public abstract void draw(Graphics g);

    public boolean intersects(Shape otherShape) {
        return ((x < otherShape.x + otherShape.width &&
                x + width > otherShape.x &&
                y < otherShape.y + otherShape.height &&
                y + height > otherShape.y));
        //|| (x < otherShape.x + otherShape.radius && x + radius && y < otherShape.y + otherShape.radius &&
        //                y + radius > otherShape.y))
    }
}

class Circle extends Shape {

    public Circle(int x, int y, Color color, int height, int width) { // Changed parameter name from "radius" to "width"
        super(x, y, color, height, width);

    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, width, height); // Changed parameter from "radius" to "width"
    }
}

class Rectangle extends Shape {
    public Rectangle(int x, int y, Color color, int height, int width) {
        super(x, y, color, height, width);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
