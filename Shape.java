/**
 * 
 */
public abstract class Shape {
    private Turtle turtle;
    private String color;
    protected int x;
    protected int y;

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.turtle = new Turtle();
        this.turtle.fillColor(color);
    }

    /**
     * 
     * @param x 
     * @param y
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

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

    public abstract void draw();

    public abstract String toString();

    public abstract boolean equals(Object obj);

    public void reset() {
        turtle.up();
        turtle.setPosition(x, y);
        turtle.down();
    }
}
