package prj5;

import java.util.Arrays;
import student.TestCase;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * 
 * @author Ian Connerney (Ianco)
 * @version 2017.10.27
 */

public class SinglyLinkedListTest extends TestCase {
    private SinglyLinkedList<String> testList;
    private Iterator<String> iter;

    /**
     * sets up test cases
     */
    public void setUp() {
        testList = new SinglyLinkedList<String>();
        iter = testList.iterator();
    }

    /**
     * tests the size method
     */
    public void testsize() {
        assertEquals(testList.size(), 0);
        testList.add("taco");
        assertEquals(testList.size(), 1);
    }

    /**
     * tests add method had 1 error Adding to the front
     */
    public void testadd() {
        String nullString = null;
        Exception exception = null;
        try {
            testList.add(nullString);
        } 
        catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception);
        assertTrue(exception instanceof IllegalArgumentException);

        testList.add("taco");
        testList.add("burrito");
        assertEquals(testList.get(testList.size() - 1), "burrito");
        testList.add(0, "enchilada");
        assertEquals(testList.get(0), "enchilada");

        exception = null;
        try {
            testList.add(0, nullString);
        } 
        catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception);
        assertTrue(exception instanceof IllegalArgumentException);

        exception = null;
        try {
            testList.add(7, "moo");
        } 
        catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception);
        assertTrue(exception instanceof IndexOutOfBoundsException);

        exception = null;
        try {
            testList.add(-1, "moo");
        } 
        catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception);
        assertTrue(exception instanceof IndexOutOfBoundsException);

        testList.clear();
        testList.add(0, "enchilada");
        assertEquals(testList.toString(), "{enchilada}");
        testList.add(0, "burrito");
        assertEquals(testList.toString(), "{burrito, enchilada}");
        testList.add(2, "taquito");
        assertEquals(testList.toString(), "{burrito, enchilada, taquito}");

    }

    /**
     * test isEmpty
     */
    public void testisEmpty() {
        assertTrue(testList.isEmpty());
        testList.add("taco");
        assertFalse(testList.isEmpty());
    }

    /**
     * tests remove SLLEqualsToArrayTest 
     * found an error with removing from the back
     * also an error with normal 
     * remove and incrementing currentIndex
     */
    public void testremove() {
        assertFalse(testList.remove("duck"));
        testList.add("taco");
        assertFalse(testList.remove("duck"));
        assertTrue(testList.remove("taco"));
        testList.add("taco");
        testList.add("burrito");
        testList.add("taco");
        testList.remove("taco");
        assertEquals(testList.get(0), "burrito");
        testList.add("burrito");
        testList.remove(0);
        assertEquals(testList.get(0), "taco");
        testList.add(0, "burrito");
        assertEquals(testList.toString(), "{burrito, taco, burrito}");
        assertTrue(testList.remove(2));
        assertEquals(testList.toString(), "{burrito, taco}");
        testList.add("taquito");
        testList.add("boom");
        testList.remove("taquito");
        assertEquals(testList.toString(), "{burrito, taco, boom}");
        testList.remove("boom");

        Exception exception = null;
        try {
            iter.remove();
        } 
        catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception);
        assertTrue(exception instanceof IllegalStateException);

        iter = testList.iterator();
        assertTrue(iter.hasNext());
        iter.next();
        assertFalse(iter.hasNext());
        iter.remove();
        assertEquals(testList.toString(), "{burrito}");

        exception = null;
        try {
            iter.next();
        } 
        catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception);
        assertTrue(exception instanceof NoSuchElementException);

        exception = null;
        try {
            testList.remove(7);
        } 
        catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception);
        assertTrue(exception instanceof IndexOutOfBoundsException);

        exception = null;
        try {
            testList.remove(-1);
        } 
        catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception);
        assertTrue(exception instanceof IndexOutOfBoundsException);

        testList.clear();
        exception = null;
        try {
            testList.remove(0);
        } 
        catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception);
        assertTrue(exception instanceof IndexOutOfBoundsException);

    }

    /**
     * tests getter method
     */
    public void testget() {
        testList.add("taco");
        testList.add("enchilada");
        testList.add("burrito");
        testList.add("queso");
        assertEquals(testList.get(0), "taco");
        assertEquals(testList.get(3), "queso");

        Exception exception = null;
        try {
            testList.get(5);
        } 
        catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception);
        assertTrue(exception instanceof IndexOutOfBoundsException);
    }

    /**
     * tests contains method
     */
    public void testcontains() {
        testList.add("taco");
        testList.add("enchilada");
        assertTrue(testList.contains("enchilada"));
        assertFalse(testList.contains("burrito"));
    }

    /**
     * tests clear() method had one error in setting size = 0 after clearing
     */
    public void testclear() {
        testList.clear();
        testList.add("taco");
        testList.add("enchilada");
        testList.add("burrito");
        assertEquals(testList.size(), 3);
        testList.clear();
        assertEquals(testList.size(), 0);
        assertEquals(testList.toString(), "{}");
    }

    /**
     * tests lastIndexOf
     */
    public void testlastIndexOf() {
        testList.add("burrito");
        testList.add("enchilada");
        testList.add("burrito");

        assertEquals(testList.lastIndexOf("burrito"), 2);
        assertEquals(testList.lastIndexOf("queso"), -1);
    }

    /**
     * tests toString method
     */
    public void testToString() {
        // should be {} insead of brackets irl
        assertEquals(testList.toString(), "{}");
        testList.add("enchilada");
        assertEquals(testList.toString(), "{enchilada}");
        testList.add("burrito");
        assertEquals(testList.toString(), "{enchilada, burrito}");
    }

    /**
     * tests equals method
     */
    public void testequals() {
        assertEquals(testList, testList);
        SinglyLinkedList<String> testList2 = null;
        assertFalse(testList.equals(testList2));
        String stringList = "list";
        assertFalse(testList.equals(stringList));
        testList.add("Taco");
        testList2 = new SinglyLinkedList<String>();
        assertFalse(testList.equals(testList2));
        testList2.add("Burrito");
        assertFalse(testList.equals(testList2));
        testList.add("Burrito");
        testList2.add(0, "Taco");
        assertEquals(testList, testList2);
    }

    /**
     * tests toArray method
     */
    public void testtoArray() {
        testList.add("Burrito");
        testList.add("Taco");
        testList.add("Enchilada");
        Object[] testArray = { "Burrito", "Taco", "Enchilada" };
        assertTrue(Arrays.equals(testList.toArray(), testArray));
        testList.remove("Burrito");
        testList.add("Taquito");
        assertFalse(Arrays.equals(testList.toArray(), testArray));
    }
}
