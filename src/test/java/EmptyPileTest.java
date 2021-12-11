import error.EmptyStackException;
import error.NoSuchElementException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EmptyPileTest {

    private Pile pile;

    @Before
    public void init()
    {
        pile = new Pile();
    }


    @Test
    public void isEmptyTest()
    {
        assertTrue(pile.isEmpty());
    }

    @Test
    public void sizeTest()
    {
        assertEquals(pile.getSize(), 0);
    }

    @Test(expected = EmptyStackException.class)
    public void getPeekOnEmptyStack() throws EmptyStackException {
        pile.peek();
    }

    @Test(expected = NoSuchElementException.class)
    public void getPeekIndexOnEmptyStack() throws EmptyStackException, NoSuchElementException {
        pile.peek(1);
    }

    @Test(expected = EmptyStackException.class)
    public void popOnEmptyStack() throws EmptyStackException {
        pile.pop();
    }
}
