public class MyClass {
    private Rectangle r;
    private int aField;
    private static int objectCount = 0; // Static field to count objects


    /**
     * Parameterized constructor
     * @param a The initial value for the 'a' field.
     * @param b The Rectangle object to be copied for the 'r' field.
     */
    public MyClass(int a, Rectangle b) {
        this.aField = a;
        this.r = b.clone(); // Make a deep copy of the Rectangle
        objectCount++;
    }

    /**
     * No-argument constructor
     * Initialize 'aField' to 0 and 'r' to a Rectangle with a length and width of 1.
     */
    public MyClass() {
        this.aField = 0;
        this.r = new Rectangle(1, 1);
        objectCount++;
    }

    /**
     * Accessor method for the 'r' field.
     *
     * @return a deep copy of the Rectangle 'r'.
     */
    public Rectangle getR() {
        return r.clone();
    }

    /**
     * Mutator method for 'aField'
     */
    public void setAField(int aField) {
        this.aField = aField;
    }
}


