public class Star extends Shape {
    public Star(int x, int y, String color) {
        super(x, y, color);
    }
    
    public Star(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw() {
        Turtle t = getTurtle();
        reset();

        for (int i = 0; i < 5; i++) {
            t.forward(100);
            t.left(144);
        }

    }

    @Override
    public String toString() {
        return "Star (x =" + getX() + ", y =" + getY() + ", dcolor =" + getColor() + "]";
    }

    public void moveTO(int newX, int newY) {
        this.x = newX;
        this.y = newY;
        reset();
    }

    /**
     * 
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
