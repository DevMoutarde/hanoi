import error.EmptyStackException;
import error.NoSuchElementException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HanoiTest {
    @Test
    public void isEmptyTest(){
        Pile pileInstance = new Pile();
        assertTrue(pileInstance.isEmpty());
    }

    @Test
    public void getSizeTest(){
        Pile pileInstance = new Pile();
        assertEquals(0, pileInstance.getSize());
    }

    @Test
    public void pushTest(){
        Pile pileInstance = new Pile();
        pileInstance.push(1);
        assertEquals(1, pileInstance.getSize());
    }

    @Test
    public void peekTest() throws EmptyStackException {
        Pile pileInstance = new Pile();
        pileInstance.push(1);
        assertEquals(1, pileInstance.peek());
    }

    @Test(expected = EmptyStackException.class)
    public void peekExceptionTest() throws EmptyStackException {
        Pile pileInstance = new Pile();
        pileInstance.peek();
    }

    @Test
    public void popTest() throws EmptyStackException {
        Pile pileInstance = new Pile();
        pileInstance.push(1);
        assertEquals(1, pileInstance.pop());
        assertEquals(0, pileInstance.getSize());
    }

    @Test(expected = EmptyStackException.class)
    public void popExceptionTest() throws EmptyStackException {
        Pile pileInstance = new Pile();
        pileInstance.pop();
    }

    @Test
    public void peekWithIndexTest() throws NoSuchElementException {
        Pile pileInstance = new Pile();
        pileInstance.push(1);
        pileInstance.push(2);
        pileInstance.push(3);
        assertEquals(2, pileInstance.peek(1));
        assertEquals(1, pileInstance.peek(0));
        assertEquals(3, pileInstance.peek(2));
    }

    @Test(expected = NoSuchElementException.class)
    public void peekExceptionWithIndexTest() throws NoSuchElementException {
        Pile pileInstance = new Pile();
        pileInstance.push(1);
        pileInstance.push(2);
        pileInstance.push(3);
        assertEquals(2, pileInstance.peek(1));
        assertEquals(1, pileInstance.peek(0));
        assertEquals(3, pileInstance.peek(2));
        pileInstance.peek(3);
    }
}
