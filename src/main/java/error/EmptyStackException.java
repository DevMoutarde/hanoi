package error;

public class EmptyStackException extends Exception{


    public EmptyStackException()
    {
        super("The stack is empty");
    }
}
