package week10.Exercise28.movable;

public class Organism implements Movable{
    private int x;
    private int y;
    public Organism(int x, int y){
        // Assign the provided x and y values to the corresponding instance variables
        this.x = x;
        this.y = y;
    }



    @Override
    public String toString() {
        // Return a string representing the x and y coordinates
        return "x= " + x + ", y= " + y;
    }


    // Implement the move method from the Movable interface
    public void move(int dx, int dy){
        // Update the x and y coordinates based on the values
        this.x += dx;
        this.y += dy;
    }
}
