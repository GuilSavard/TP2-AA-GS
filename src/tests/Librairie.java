package tests;

import livres.Auteur;
import livres.Ouvrage;
import livres.OuvrageAudio;
import livres.OuvragePapier;

import java.util.ArrayList;
import java.util.List;

public class Librairie {
    private List<Auteur> auteurs  = new ArrayList<>();
    private List<Ouvrage> ouvrages = new ArrayList<>();

    public Librairie(){
        Auteur albertine = new Auteur("Albertine", "Tremblay", "Canada");
        Auteur john = new Auteur("John", "Smith", "Etats-Unis");
        Auteur jean = new Auteur("Jean", "Némarre", "Suisse");
        auteurs.add(albertine);
        auteurs.add(john);
        auteurs.add(jean);

        ouvrages.add(new OuvrageAudio("Titre 1", john, 1, OuvrageAudio.Format.Numerique));
        ouvrages.add(new OuvragePapier("Titre 2", albertine, 340));
        ouvrages.add(new OuvragePapier("Titre 3", john, 400));
        ouvrages.add(new OuvragePapier("Titre 4", john, 700));
        ouvrages.add(new OuvragePapier("Titre 5", albertine,600));
        ouvrages.add(new OuvragePapier("Titre 6", john,231));
        ouvrages.add(new OuvrageAudio("Titre 7", john, 20, OuvrageAudio.Format.Analogique));
        ouvrages.add(new OuvrageAudio("Titre 8", albertine,30, OuvrageAudio.Format.Analogique));
        ouvrages.add(new OuvragePapier("Titre 9", john,200));
        ouvrages.add(new OuvragePapier("Titre 10", jean,200));
    }

    public List<Auteur> getAuteurs() {
        return auteurs;
    }

    public List<Ouvrage> getOuvrages() {
        return ouvrages;
    }

    public List<Ouvrage> trouverOuvrages(Auteur auteur) {
        //ATTENTION il faut implémenter equals dans auteur pour que ca marche!!!!!
        int count = 0;

        List<Ouvrage> trouves = new ArrayList<>();
        for (Ouvrage ouvrage : ouvrages) {
            if (ouvrage.getAuteur().equals(auteur)) {
                trouves.add(ouvrage);
            }
        }

        return trouves;
    }
}
