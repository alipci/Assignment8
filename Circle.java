public class Circle extends Shape {
    /**
     * Constructor for Circle. Giving position and color.
     * @param x the x position
     * @param y the y position
     * @param color the color of the circle
     */
    public Circle(int x, int y, String color) {
        super(x, y, color);
    }

    /**
     * Constructor for Circle. Giving position with default color.
     * @param x the x position
     * @param y the y position
     */
    public Circle(int x, int y) {
        super(x, y);
    }

    /**
     * Draws the circle using Turtle.
     */
    @Override
    public void draw() {
        reset();
        Turtle t = getTurtle();

        for (int i = 0; i < 360; i++) {
            t.forward(2);
            t.left(1);
        }
    }

    /**
     * Returns a string representation of the circle, including its position and color.
     */
    @Override
    public String toString() {
        return "Circle at (" + getX() + ", " + getY() + ") with color " + getColor();
    }

    /**
     * Compares two Circle objects.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;

        if (!(obj instanceof Circle))
            return false;

        Circle other = (Circle) obj;

        return getX() == other.getX() && getY() == other.getY() && getColor().equals(other.getColor());
    }
}