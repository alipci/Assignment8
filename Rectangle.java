/**
 * Rectangle class that extends Shape.
 * Draws a rectangle using the Turtle class.
 * 
 * @author Ricardo Ricketts Jr
 */
public class Rectangle extends Shape {

    private int width;
    private int height;

    /**
     * Creates a rectangle with a position, size, and color.
     * 
     * @param x x-coordinate
     * @param y y-coordinate
     * @param width rectangle width
     * @param height rectangle height
     * @param color rectangle color
     */
    public Rectangle(int x, int y, int width, int height, String color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    /**
     * Creates a rectangle with a default color.
     * 
     * @param x x-coordinate
     * @param y y-coordinate
     * @param width rectangle width
     * @param height rectangle height
     */
    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    /**
     * Draws the rectangle.
     */
    @Override
    public void draw() {
        Turtle t = getTurtle();

        reset();

        for (int i = 0; i < 2; i++) {
            t.forward(width);
            t.left(90);
            t.forward(height);
            t.left(90);
        }
    }

    /**
     * Gets rectangle area.
     * 
     * @return area
     */
    public int getArea() {
        return width * height;
    }

    /**
     * Moves rectangle to a new position.
     * 
     * @param newX new x-coordinate
     * @param newY new y-coordinate
     */
    public void moveTo(int newX, int newY) {
        this.x = newX;
        this.y = newY;
        reset();
    }

    /**
     * Scales rectangle size.
     * 
     * @param factor scale factor
     */
    public void scale(int factor) {
        width *= factor;
        height *= factor;
    }

    /**
     * Gets rectangle width.
     * 
     * @return width
     */
    public int getWidth() {
        return width;
    }

    /**
     * Gets rectangle height.
     * 
     * @return height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Returns rectangle information.
     * 
     * @return rectangle as a string
     */
    @Override
    public String toString() {
        return "Rectangle[x=" + getX()
                + ", y=" + getY()
                + ", width=" + width
                + ", height=" + height
                + ", color=" + getColor() + "]";
    }

    /**
     * Checks if rectangles are equal.
     * 
     * @param obj object being compared
     * @return true if equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Rectangle)) {
            return false;
        }

        Rectangle other = (Rectangle) obj;

        return this.getX() == other.getX()
                && this.getY() == other.getY()
                && this.width == other.width
                && this.height == other.height
                && this.getColor().equals(other.getColor());
    }
}
