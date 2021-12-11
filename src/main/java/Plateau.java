import error.DeplacementImpossible;
import error.NoSuchElementException;

import java.util.HashMap;
import java.util.Map;

public class Plateau implements Tours{

    private Map<String, Pile> plateau;
    public Plateau()
    {
        this.plateau = new HashMap<>();
        this.plateau.put("A", new Pile());
        this.plateau.put("B", new Pile());
        this.plateau.put("C", new Pile());
    }

    @Override
    public void initialiserTours(int nombreAnneaux)
    {
        Pile pileA = this.plateau.get("A");
        for (int tailleAnneau = nombreAnneaux; tailleAnneau > 0 ; tailleAnneau--)
        {
            pileA.push(tailleAnneau);
        }

    }

    @Override
    public String afficherTours() throws NoSuchElementException {

        String content = new String();
        int higherStack = getHigherStack();

        for(int i = higherStack; i > 0 ; i--)
        {
            for(Pile pile: this.plateau.values())
            {
                if(pile.getSize() >= i)
                {
                    content += pile.peek(i -1);
                }
                else
                {
                    content += " ";
                }

            }
            content +="\n";
        }
        System.out.println(content);
        return null;
    }


    private int getHigherStack()
    {
        int higherStack = 0;
        for(String key: this.plateau.keySet())
        {
            int stackSize;
            stackSize = this.plateau.get(key).getSize();
            if(stackSize > higherStack)
            {
                higherStack = stackSize;
            }
        }
        return higherStack;
    }

    private String createHeader()
    {
        String header = new String();
        header += "| ";
        for(String key: this.plateau.keySet())
        {
            header += key;
            header += " | ";
        }
        header += "\n-------------";
        return header;
    }

    @Override
    public void deplacerAnneau(int tourDepart, int tourArrivee) throws DeplacementImpossible {

    }
}
