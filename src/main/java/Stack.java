import error.EmptyStackException;
import error.NoSuchElementException;

/**
 * Interface of a Stack 
 */
public interface Stack {
    /**
     * Tests if this stack is empty 
     */
    boolean isEmpty();
    /**
     * Returns the number of items in this stack. 
     */
    int getSize(); /**
     */
    void push(int item);
    /**
     * Looks at the object at the top of this stack without removing  
     * it from the stack. 
     */
    int peek() throws EmptyStackException;
    /**
     * Removes the object at the top of this stack and returns 
     * that object as the value of this function. 
     * @throws EmptyStackException if this stack is empty. 
     */
    int pop() throws EmptyStackException;
    /**
     * Looks at any object in this stack without removing it from the stack. 
     * This is used to display the stack 
     * @param index index of the element 0 being the bottom most element 
     */
    int peek(int index) throws NoSuchElementException;
}