public class Triangle extends Shape {
    /**
     * Constructor for Triangle. Giving postioion and color
     * @param x
     * @param y
     * @param color
     */
    public Triangle(int x, int y, String color) {
        super(x, y, color);
    }
    /**
     * Constructor for Triangle. Giving postioion with default color
     * @param x
     * @param y
     */
    public Triangle(int x, int y){
        super(x, y);
    }
    /**
     * Draws the triangle using Turtle
     */
    @Override
    public void draw() {
        reset();
        Turtle t = getTurtle();

        for (int i = 0; i < 3; i++) {
            t.forward(100);
            t.left(120);
        }
    }
    /**
     * Returns a string representation of the triangle, including its position and color.
     */
    @Override
    public String toString() {
        return "Triangle at (" + getX() + ", " + getY() + ") with color " + getColor();
    }
    /**
     * Compares two triangle objects
     */
    @Override
    public boolean equals(Object obj){
        if (obj == null) 
            return false;
        if (!(obj instanceof Triangle))
            return false;
        Triangle other = (Triangle) obj;
        return getX() == other.getX() && getY() == other.getY() && getColor().equals(other.getColor());
    }
}