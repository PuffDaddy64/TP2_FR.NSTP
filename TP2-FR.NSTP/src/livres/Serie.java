package livres;

import java.util.List;

public class Serie
{
    private String nom;
    private List<Ouvrage> listeOuvrages;

    public Serie(String nom, List<Ouvrage> listeOuvrages) {
        this.nom = nom;
        this.listeOuvrages = listeOuvrages;
    }


    @Override
    public String toString() {
        return "Serie{" +
                "nom='" + nom + '\'' +
                ", listeOuvrages=" + listeOuvrages +
                '}';
    }
}
