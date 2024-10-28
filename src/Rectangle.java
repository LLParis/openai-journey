/**
 * A Rectangle class representing a geometric rectangle with a length and width.
 * This class provides methods for:
 * <ul>
 *     <li>Constructing rectangles with or without specified dimensions.</li>
 *     <li>Accessing and modifying the length and width properties.</li>
 *     <li>Creating deep copies of rectangle objects.</li>
 *     <li>Comparing two rectangles for equality.</li>
 *     <li>Generating string representation of rectangle objects.</li>
 * </ul>
 *
 * @author London Paris
 */

public class Rectangle {
    private double length;
    private double width;

    /**
     * No-Argument Constructor
     * Constructs a new Rectangle with default length and width of 1.0.
     */
    public Rectangle() {
        this.length = 1.0; // Default length
        this.width = 1.0; // Default width
    }

    /**
     * Parameterized Contructor with length and width parameters
     * @param length of the Rectangle
     * @param width of the Rectangle
     */
    public Rectangle(double length, double width) {
        if (length < 0) {
            throw new IllegalArgumentException("Length must be a positive value.");
        }
        if (width < 0) {
            throw new IllegalArgumentException("Width must be a positive value.");
        }
        this.length = length;
        this.width = width;
    }

    // Accessor methods

    /**
     * Accessor method for Rectangle length
     * @return the length of the rectangle
     */
    public double getLength() {
        return this.length;
    }

    /**
     * Accessor method for Rectangle width
     * @return the width of the rectangle
     */
    public double getWidth() {
        return this.width;
    }

    // Mutator methods

    /**
     * Mutator method for Rectangle length
     * @param length that you want to change to
     */
    public void setLength(double length) {
        if (length < 0) {
            throw new IllegalArgumentException("Length must be a positive value.");
        }
        this.length = length;
    }

    /**
     * Mutator method for Rectangle width
     * @param width that you want to change to
     */
    public void setWidth(double width) {
        if (width < 0) {
            throw new IllegalArgumentException("Width must be a positive value.");
        }
        this.width = width;
    }

    /**
     * Clone method to create a deep copy of the rectangle
     * @return a deep copy of the current object
     */
    public Rectangle clone() {
        return new Rectangle(this.length, this.width);
    }

    /**
     * Compares this Rectangle to the specified object for equality.
     * Overrides the {@link Object#equals(Object)} method to provide
     * a value-based comparison. Two Rectangles are considered equal
     * if they have the same length and width.
     *
     * @param obj the object to compare this Rectangle against
     * @return true if the given object is also a Rectangle and has the
     *         same length and width as this Rectangle; false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Rectangle other = (Rectangle) obj;
        return Double.compare(this.length, other.length) == 0 && Double.compare(this.width, other.width) == 0;
    }

    /**
     * Returns a string representation of this Rectangle.
     * The string representation is in the format "Rectangle(Length = x, Width = y)",
     * where x is the length and y is the width of the rectangle.
     * <p>
     * For example, a rectangle with length 5.0 and width 3.0 would be
     * represented as "Rectangle(Length = 5.0, Width = 3.0)".
     *
     * @return a string representation of this Rectangle
     */
    public String toString() {
        return "Rectangle(Length = " + this.length + ", Width = " + this.width + ")";
    }
}