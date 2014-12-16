package solution;

/**
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
        int rotatedArray[] = new int[array.length];
        int n = pos;
        int initialPos = n;

        for (int i = 0; i < array.length; i++) {
            int value = array.length - n;
            if (n != 0) {
                rotatedArray[i] = array[value];
                n--;
            } else {
                rotatedArray[i] = array[i - initialPos];
            }
        }
        return rotatedArray;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6 };
        int pos = 2;
        int[] rotatedArray = ArrayRotator.rotateIntArray(array, pos);
        for (int j : rotatedArray) {
            System.out.print(j + " ");
        }
    }
}
