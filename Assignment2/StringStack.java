import java.util.Arrays;

public class StringStack {
    /**
     * The stack.
     */
    private String[] stack;

    /**
     * The index to the stack.
     */
    private int stackIndex;

    /**
     * Constructor for objects of class Stack with a capacity.
     */
    public StringStack(int capacity) {
        stack = new String[capacity];
    }

    /**
     * Push the parameter onto the stack.
     *
     * @param value The value to push onto the stack.
     */
    public void push(String value) throws StackException {
        if (stackIndex < stack.length){
            stack[stackIndex++] = value;
        } else {
            throw new StackOverflowException();

        }
    }

    /**
     * Remove the last value on the stack and return it.
     *
     * @return The last value pushed onto the stack.
     */
    public String pop() throws StackException {
        String returnValue = null;
        if (stackIndex > 0){
            returnValue = stack[--stackIndex];
        } else {
            throw new StackUnderflowException();
        }
        return returnValue;
    }

    /**
     * Extra Credit
     * Remove the last n values on the stack and return
     * them as an array.  If the requested size is larger
     * than our array size, throw an exception.
     *
     * @param n The number of values to remove from the stack.
     * @return The last n values pushed onto the stack.
     */
    public String[] pop(int n) throws StackException {
        String[] returnValue = null;
        int first = 0;
        int last = 0;
        if (n < stackIndex) {
            last = stackIndex;
            first = stackIndex - n;
            stackIndex = first;
        } else {
            last = stackIndex;
            first = 0;
            stackIndex = 0;
        }
        returnValue = Arrays.copyOfRange(stack, first, last);
        Arrays.fill(stack, first, last, null);
        return returnValue;
    }

    /**
     * Return the last value on the stack without removing it.
     *
     * @return The last value pushed onto the stack.
     */
    public String peek() throws StackException {
        String returnValue = null;
        if (stackIndex > 0) {
            returnValue = stack[stackIndex - 1];

        } else {
            throw new StackUnderflowException();
        }
        return returnValue;
    }

    public class StackException extends Exception {

        /**
         * Constructor for objects of class StackException
         */
        public StackException(String message) {
            super(message);
        }
    }

    private class StackOverflowException extends StackException {
        private static final String OVERFLOW_MESSAGE = "Push requested on full stack";
        /**
         * Constructor for objects of class StackOverflowException
         */
        public StackOverflowException() {
            super(OVERFLOW_MESSAGE);
        }
    }

    private class StackUnderflowException extends StackException {
        private static final String UNDERFLOW_MESSAGE = "Pop requested on empty stack";
        /**
         * Constructor for objects of class StackUnderflowException
         */
        public StackUnderflowException() {
            super(UNDERFLOW_MESSAGE);
        }
    }
}
