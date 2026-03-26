package tests;


import livres.Auteur;
import livres.Ouvrage;
import livres.Pays;
import livres.Serie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestSerie
{


    public static void main(String[] args) {
        Pays roumanie = new Pays("Roumanie", "ROM");
        Pays allemagne = new Pays("Allemagne", "ALG");
        Auteur albertine = new Auteur("Albertine", "Tremblay", roumanie);
        Auteur john = new Auteur("John", "Smith", allemagne);

        List<Ouvrage> ouvrageImpaire = new ArrayList<>();
        List<Ouvrage> ouvragePair = new ArrayList<>();

        ouvrageImpaire.add(new Ouvrage("Titre 1", john));
        ouvragePair.add(new Ouvrage("Titre 2", albertine));
        ouvrageImpaire.add(new Ouvrage("Titre 3", john));
        ouvragePair.add(new Ouvrage("Titre 4", john));
        ouvrageImpaire.add(new Ouvrage("Titre 5", albertine));
        ouvragePair.add(new Ouvrage("Titre 6", john));
        ouvragePair.add(new Ouvrage("Titre 7", john));
        ouvragePair.add(new Ouvrage("Titre 8", albertine,Ouvrage.Format.VIDEO));
        ouvrageImpaire.add(new Ouvrage("Titre 9", john,Ouvrage.Format.AUDIO));
        ouvragePair.add(new Ouvrage("Titre 10", john));

        Serie listeOuvragePair = new Serie("Pair", ouvragePair);
        Serie listeOuvrageImpaires = new Serie("Impaire", ouvrageImpaire);

        System.out.println(listeOuvrageImpaires);
        System.out.println(listeOuvragePair);

    }

}
