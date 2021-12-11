import error.DeplacementImpossible;
import error.NoSuchElementException;

/**
 * Interface pour gérer les tours de Hanoï 
 */
public interface Tours {
    /**
     * Intialise les tours avec des anneaux sur la première tour 
     * @param nombreAnneaux les anneaux à placer sur la première tour 
     */
    void initialiserTours(int nombreAnneaux);

    /**
     * Affiche l'état actuel des tours 
     * @return chaine pour affichage 
     */
    String afficherTours() throws NoSuchElementException;



    /**
     * Déplace un anneau d'une tour vers une autre si c'est possible 
     * @param tourDepart la tour de départ 
     * @param tourArrivee la tour d'arrivée 
     * @throws DeplacementImpossible si le déplacement est impossible 
     */
    void deplacerAnneau(int tourDepart, int tourArrivee)
            throws DeplacementImpossible;
}