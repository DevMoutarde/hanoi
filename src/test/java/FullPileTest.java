import error.EmptyStackException;
import error.NoSuchElementException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FullPileTest {

    private Pile pile;

    @Before
    public void init()
    {
        pile = new Pile();
        pile.push(3);
        pile.push(2);
        pile.push(1);
    }


    @Test
    public void isEmptyTest()
    {
        assertFalse(pile.isEmpty());
    }

    @Test
    public void sizeTest()
    {
        assertEquals(pile.getSize(), 3);
    }

    @Test
    public void getPeekOnStackTest() throws EmptyStackException {
        assertEquals(pile.peek(), 1);
    }

    @Test
    public void getPeekIndexOnStack() throws EmptyStackException, NoSuchElementException {
        assertEquals(pile.peek(0), 3);
        assertEquals(pile.peek(1), 2);
        assertEquals(pile.peek(2), 1);
    }

    @Test
    public void popOnStackTest() throws EmptyStackException {
        pile.pop();
        assertEquals(pile.getSize(), 2);
        assertEquals(pile.peek(), 2);

    }
}
