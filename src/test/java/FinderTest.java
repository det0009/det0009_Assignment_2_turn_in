import org.junit.Test;
import org.junit.*;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class FinderTest  {
    @Test public void testFindMax_valid() {
        Finder test = new Finder();
        int[] intArray = new int[] {1,3,5,2,4};
        int expected_result = 5;
        int actual_result = test.findMax(intArray);
        // test
        assertEquals(actual_result,expected_result);

    }
    @Test public void testFindMax_null()  {
        Finder test = new Finder();
        int[] intArray = null;
        assertNull(test.findMax(intArray));

    }
    @Test public void testFindMax_empty() {
        Finder test = new Finder();
        int[] intArray = new int[]{};
        assertNull(test.findMax(intArray));

    }

    @Test public void testFindMin_valid() {
        Finder test = new Finder();
        int[] intArray = new int[] {1,3,5,2,4};
        int expected_result = 1;
        int actual_result = test.findMin(intArray);
        // test
        assertEquals(actual_result,expected_result);
    }

    @Test public void testFindMin_null()  {
        Finder test = new Finder();
        int[] intArray = null;
        assertNull(test.findMin(intArray));

    }
    @Test public void testFindMin_empty() {
        Finder test = new Finder();
        int[] intArray = new int[]{};
        assertNull(test.findMin(intArray));

    }
}