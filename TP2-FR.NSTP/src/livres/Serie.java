package livres;

import java.util.List;

public class Serie
{
    private String nom;
    private List<String> listeOuvrages;

    public Serie(String nom, List<String> listeOuvrages) {
        this.nom = nom;
        this.listeOuvrages = listeOuvrages;
    }
}
