package livres;

import java.time.LocalDate;

public class OuvrageVideo extends Ouvrage {

    private int dureeMin;
    private int tailleMb;

    public OuvrageVideo(String titre, Auteur auteur,
                        LocalDate date, int nombreExemplaires,
                        int dureeMin, int tailleMb) {
        super(titre, auteur, date, nombreExemplaires);
        this.dureeMin = dureeMin;
        this.tailleMb = tailleMb;
    }

    @Override
    public String toString() {
        return "Ouvrage vidéo de " + dureeMin +
               " minutes, taille " + tailleMb + " MB.\n" + super.toString();
    }