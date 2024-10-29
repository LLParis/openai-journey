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
        if(a < 0) {
            throw new IllegalArgumentException("Value must be positive.");
        }
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
     * Copy constructor
     *
     * @param other the MyClass object to be copied
     */
    public MyClass(MyClass other) {
        this.aField = other.aField;
        this.r = other.r.clone();
        objectCount++;
    }

    /**
     * Accessor method for the 'aField' field.
     *
     * @return the integer represented 'aField'.
     */
    public int getAField() {
        return this.aField;
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
     * Accessor method for the number of objects
     * @return the number of objects that have been created
     */
    public static int getObjectCount() {
        return objectCount;
    }

    /**
     * Mutator method for 'aField'
     */
    public void setAField(int a) {
        if(a < 0) {
            throw new IllegalArgumentException("Value must be positive.");
        }
        this.aField = a;
    }

    /**
     * Returns a string representation of this MyClass object.
     * The string representation is in the format "MyClass(aField = x, r = y)",
     * where x is the value of aField and y is the string representation of the Rectangle r.
     *
     * @return a string representation of this MyClass object
     */
    @Override
    public String toString() {
        return "MyClass(aField = " + this.aField + ", r = " + this.r + ")";
    }

    /**
     * Equals method.
     *
     * @param obj the object to compare this MyClass against.
     * @return true if the given object is also a MyClass and has the
     * same 'aField' value and an equal Rectangle as this MyClass;
     * false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MyClass other = (MyClass) obj;

        return this.aField == other.aField && this.r.equals(other.r);
    }
}


