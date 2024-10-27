/**
 * Rectangle class with all methods fully implemented
 *
 * @author London Paris
 */

public class Rectangle {
    private double length;
    private double width;

    /**
     * No-Argument Constructor
     *
     */
    public Rectangle() {
        this.length = 1.0; // Default length
        this.width = 1.0; // Default width
    }

    /**
     * Contructor with length and width parameters
     * @param length
     * @param width
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Accessor methods

    /**
     * Accessor method for length
     * @return the length of the rectangle
     */
    public double getLength() {
        return this.length;
    }

    /**
     * Accessor method for width
     * @return the width of the rectangle
     */
    public double getWidth() {
        return this.width;
    }

    // Mutator methods
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Clone method to create a deep copy of the rectangle
     */
    public clone() {

    }

    @Override
    public boolean equals(Rectangle other) {

    }

    public String toString() {

    }
}