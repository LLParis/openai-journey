import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyClassTest {
    @Test
    public void testNoArgConstructor() {
        MyClass myClass = new MyClass();
        assertEquals(0, myClass.getAField());
        assertEquals(new Rectangle(1, 1), myClass.getR());
    }

    @Test
    public void testParameterizedConstructor() {
        MyClass myClass = new MyClass(4, new Rectangle(1,1));
        assertEquals(4, myClass.getAField());
        assertEquals(new Rectangle(1,1), myClass.getR());
    }

    @Test
    public void testCopyConstructor() {
        MyClass myClass1 = new MyClass(5, new Rectangle(2, 3));
        MyClass myClass2 = new MyClass(myClass1);

        assertEquals(5, myClass1.getAField());
        assertEquals(myClass1.getR(), myClass2.getR());
        assertNotSame(myClass1.getR(), myClass2.getR());
    }

    @Test
    public void testSetAField() {
        MyClass myClass = new MyClass();
        myClass.setAField(5);
        assertEquals(5, myClass.getAField());
    }

    @Test
    public void testEquals() {
        MyClass myClass1 = new MyClass(5, new Rectangle(3, 4));
        MyClass myClass2 = new MyClass(5, new Rectangle(3, 4));
        MyClass myClass3 = new MyClass(1, new Rectangle(3, 4));

        assertTrue(myClass1.equals(myClass2));
        assertFalse(myClass1.equals(myClass3));
        assertFalse(myClass1.equals(null));
    }

    @Test
    public void testToString() {
        MyClass myClass = new MyClass(3, new Rectangle(2, 5));
        assertEquals("MyClass(aField = 3, r = Rectangle(Length = 2.0, Width = 5.0))", myClass.toString());
    }

    @Test public void testObjectCount() {
        MyClass myClass1 = new MyClass();
        MyClass myClass2 = new MyClass();
        MyClass myClass3 = new MyClass();
        assertEquals(3, MyClass.getObjectCount());
    }
}