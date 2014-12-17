package solution;

import solution.exception.ArrayRotationException;

/**
 * Utility class to rotate the array by n positions
 * For Now, It only supports integer array rotation
 *
 * @author Hikmat Dhamee
 * @email hikmatdhamee@gmail.com
 */
public class ArrayRotator {

    /**
     * Rotates an integer array right by n positions
     *
     * @param array  : Input array of integers
     * @param pos    : Position to rotate by
     * @return       : A rotated array by <code>pos</code> position
     */
    public static int[] rotateIntArray(int[] array, int pos){

        // check if rotation pos is grater/less then array length
        if( pos > array.length || pos < 0 ){
            throw new ArrayRotationException("Couldn't rotate array");
        }
        int rotatedArray[] = new int[array.length];
        int n = pos;
        int initialPos = n;

        for (int i = 0; i < array.length; i++) {
            int index = array.length - n;
            if (n != 0) {
                rotatedArray[i] = array[index];
                n--;
            } else {
                rotatedArray[i] = array[i - initialPos];
            }
        }
        return rotatedArray;
    }

    public static void main(String[] args) throws ArrayRotationException{
        int[] array = { 1, 2, 3, 4, 5, 6 };
        int pos = 2;
        int[] rotatedArray = ArrayRotator.rotateIntArray(array, pos);
        for (int j : rotatedArray) {
            System.out.print(j + " ");
        }
    }
}
