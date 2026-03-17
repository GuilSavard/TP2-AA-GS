package livres;

import java.time.LocalDate;

public class OuvrageVideo extends Ouvrage {

    public static final int MINUTES_DEFAUT = 0;
    public static final int TAILLE_DEFAULT = 0;

    private int minutes;
    private int taille;

    public OuvrageVideo(String titre, Auteur auteur, int nombreExemplaires, LocalDate date) {
        super(titre, auteur, nombreExemplaires, date);
        this.minutes=MINUTES_DEFAUT;
        this.taille=TAILLE_DEFAULT;
    }

    public OuvrageVideo(String titre, Auteur auteur, LocalDate date, int nombreExemplaires) {
        super(titre, auteur, date, nombreExemplaires);
        this.minutes=MINUTES_DEFAUT;
        this.taille=TAILLE_DEFAULT;
    }

    public OuvrageVideo(String titre, Auteur auteur) {
        super(titre, auteur);
        this.minutes=MINUTES_DEFAUT;
        this.taille=TAILLE_DEFAULT;
    }


    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getTaille() {
        return taille;
    }

    @Override
    public String toString() {
        return "OuvrageVideo{" +
                "minutes=" + minutes +
                ", taille=" + taille +
                '}';
    }
}
