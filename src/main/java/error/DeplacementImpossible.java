package error;

public class DeplacementImpossible extends Exception{

    public DeplacementImpossible()
    {
        super("Impossible to move the item");
    }
}
