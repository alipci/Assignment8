/**
 * Parent class for drawing shape with turtle.
 * @author Aung Aung
 */
public abstract class Shape {
    /**
     * Turtle used to draw shape.
     */
    private Turtle turtle;

    /**
     * Color of the shape.
     */
    private String color;

    /**
     * X coordinate.
     */
    protected int x;

    /**
     * Y coordinate.
     */
    protected int y;

    /**
     * draw any shape with turtle
     * @param x x coordinates
     * @param y y coordinates
     * @param color color of the shape
     */
    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.turtle = new Turtle();
        this.turtle.fillColor(color);
        this.turtle.outlineColor(color);
    }

    /**
     * draw a shape with specific color.
     * @param x x coordinates
     * @param y y coordinates
     */
    public Shape(int x, int y) {
        this(x, y, "black");
    }

    /**
     * get Turtle
     * @return turtle
     */
    public Turtle getTurtle() {
        return turtle;
    }

    /**
     * get X coordinates
     * @return
     */
    public int getX() {
        return x;
    }

    /**
     * get Y coordinates
     * @return Y coordinates
     */
    public int getY() {
        return y;
    }

    /**
     * get Color for the shapes
     * @return color of the shape
     */
    public String getColor() {
        return color;
    }

    /**
     * draw the shape with turtle
     */
    public abstract void draw();

    /**
     * reset turtle position
     */
    public void reset() {
        turtle.up();
        turtle.setPosition(x, y);
        turtle.down();
    }
}
