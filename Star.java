/**
 * Star class that uses Shape as parent class.
 * Draws a star using the Turtle class.
 * 
 * @author Aung Aung
 */
public class Star extends Shape {
    /**
     * Constructor for Star that uses x and y coords as well as color.
     * @param x x coordinate
     * @param y y coordinate
     * @param color star color
     */
    public Star(int x, int y, String color) {
        super(x, y, color);
    }
    
    /**
     * Star with a default color.
     * @param x x coordinate
     * @param y y coordinate
     */
    public Star(int x, int y) {
        super(x, y);
    }

    /**
     * draw the star.
     */
    @Override
    public void draw() {
        Turtle t = getTurtle();
        reset();

        for (int i = 0; i < 5; i++) {
            t.forward(100);
            t.left(144);
        }

    }

    /**
     * Get star information in string format.
     * @return star as string
     */
    @Override
    public String toString() {
        return "Star (x =" + getX() + ", y =" + getY() + ", dcolor =" + getColor() + "]";
    }

    /**
     * move star to new location.
     * @param newX new x coordinate
     * @param newY new y coordinate
     */
    public void moveTo(int newX, int newY) {
        this.x = newX;
        this.y = newY;
        reset();
    }

    /**
     * Checks if star is equal or not
     * @param obj object being compared to
     * @return true if equal
     */
    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if (!(obj instanceof Star)) {
            return false;
        }
        Star other = (Star) obj;
        return this.getX() == other.getX() && this.getY() == other.getY() && this.getColor().equals(other.getColor());
    }
}
