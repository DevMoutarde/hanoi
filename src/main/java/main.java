import error.NoSuchElementException;

public class main {

    public static void main(String[] args) throws NoSuchElementException {
        Plateau plateau = new Plateau();
        plateau.initialiserTours(3);
        plateau.afficherTours();

    }
}
