package solution.exception;

/**
 * @author Hikmat Dhamee
 * @email me.hemant.available@gmail.com
 */
public class ArrayRotationException extends RuntimeException {

    // zero-arg Constructor
    public ArrayRotationException() {}

    //Constructor that accepts a message
    public ArrayRotationException(String message) {
        super(message);
    }
}
