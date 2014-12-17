package solution;

import org.junit.Assert;
import org.junit.Test;
import solution.exception.ArrayRotationException;

/**
 * @author Hikmat Dhamee
 * @email me.hemant.available@gmail.com
 */
public class ArrayRotatorUnitTest {

    /**
     * Test Case-1
     * Tests empty array
     */
    @Test
    public void testRotationOfEmptyArray(){
        int[] inputArray = {};
        int[] expectedArray = {};
        int pos = 0;
        Assert.assertArrayEquals("Empty Array Assertion ", expectedArray, ArrayRotator.rotateIntArray(inputArray, pos));
    }

    /**
     * Test Case-2
     * Tests rotation by zero position
     */
    @Test
    public void testRotationByZeroPosition(){
        int[] inputArray = { 1, 2, 3, 4, 5, 6 };
        int[] expectedArray ={ 1, 2, 3, 4, 5, 6 };
        int pos = 0;
        Assert.assertArrayEquals("Rotation by zeo", expectedArray, ArrayRotator.rotateIntArray(inputArray, pos));
    }

    /**
     * Test Case-3
     * Tests rotation by positions greater then array size
     * In this case, we expect <code>ArrayRotationException</code>
     */
    @Test(expected=ArrayRotationException.class)
    public void testRotationByGreaterThenArraySize(){
        int[] inputArray = { 1, 2, 3, 4, 5, 6 };
        int pos = 7;
        ArrayRotator.rotateIntArray(inputArray,pos);

    }

    /**
     * Test Case-4
     * Tests rotation by positions less then array size
     *  In this case, we expect <code>ArrayRotationException</code>
     */
    @Test(expected=ArrayRotationException.class)
    public void testRotationByLessThenArraySize(){
        int[] inputArray = { 1, 2, 3, 4, 5, 6 };
        int pos = -1;
        ArrayRotator.rotateIntArray(inputArray,pos);

    }

    /**
     * Test Case-5
     * Tests rotation of empty array by non-zero position
     *  In this case, we expect <code>ArrayRotationException</code>
     */
    @Test(expected=ArrayRotationException.class)
    public void testEmptyArrayRotation(){
        int[] inputArray = {};
        int pos = 2;
        ArrayRotator.rotateIntArray(inputArray,pos);

    }

    /**
     * Test Case-6
     * Tests rotation of non-empty array by 3
     * This is normal case
     */
    @Test
    public void testArrayRotation(){
        int[] inputArray = {1,2,3,4,5,6};
        int[] expectedArray = {4,5,6,1,2,3,};
                int pos = 3;
        Assert.assertArrayEquals("Testing normal case",expectedArray,ArrayRotator.rotateIntArray(inputArray,pos));

    }
}
