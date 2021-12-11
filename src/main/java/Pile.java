import error.EmptyStackException;
import error.NoSuchElementException;

import java.util.ArrayList;


public class Pile implements Stack{

    private ArrayList<Integer> tour;

    public Pile()
    {
        this.tour = new ArrayList<>();
    }


    @Override
    public boolean isEmpty() {
        return this.tour.isEmpty();
    }

    @Override
    public int getSize() {
        return this.tour.size();
    }

    @Override
    public void push(int item) {
        this.tour.add(item);
    }

    @Override
    public int peek() throws EmptyStackException {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }
        return this.tour.get(getSize() -1);
    }

    @Override
    public int pop() throws EmptyStackException {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }
        return this.tour.remove(getSize() -1);
    }

    @Override
    public int peek(int index) throws NoSuchElementException {
        if(index > getSize())
        {
            throw new NoSuchElementException();
        }
        return this.tour.get(index);
    }
}
