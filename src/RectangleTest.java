import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    public void testNoArgumentConstructor() {
        Rectangle rectangle = new Rectangle();
        assertEquals(1.0, rectangle.getLength());
        assertEquals(1.0, rectangle.getWidth());
    }

    @Test
    public void testParameterizedConstructor() {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        assertEquals(5.0, rectangle.getLength());
        assertEquals(3.0, rectangle.getWidth());
    }

    @Test
    public void testGettersAndSetters() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(6.0);
        rectangle.setWidth(4.0);
        assertEquals(6.0, rectangle.getLength());
        assertEquals(4.0, rectangle.getWidth());
    }

    @Test
    public void testClone() {
        Rectangle rectangle1 = new Rectangle(2.0, 4.0);
        Rectangle rectangle2 = rectangle1.clone();
        assertEquals(rectangle1.getLength(), rectangle2.getLength());
        assertEquals(rectangle1.getWidth(), rectangle2.getWidth());
        assertNotSame(rectangle1, rectangle2); // Verify they are the same objects
    }

    @Test
    public void testEquals() {
        Rectangle rectangle1 = new Rectangle(7.0, 2.0);
        Rectangle rectangle2 = new Rectangle(7.0, 2.0);
        Rectangle rectangle3 = new Rectangle(5.0, 2.0);

        assertEquals(rectangle1, rectangle2); // Same dimensions
        assertNotEquals(rectangle1, rectangle3); // Different dimensions
        assertNotEquals(rectangle1, null); // Not equal to null
        assertEquals(rectangle1, rectangle1); // Reflexive property
    }

    @Test
    public void testToString() {
        Rectangle rectangle = new Rectangle(8.0, 1.5);
        assertEquals("Rectangle(Length = 8.0, Width = 1.5", rectangle.toString());
    }

    @Test
    public void testInvalidLength() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(-2.0, 3.0); // Try creating a rectangle with negative length
        });
    }

    @Test
    public void testInvalidWidth() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(2.0, -3.0); // Try creating a rectangle with negative width
        });
    }

}