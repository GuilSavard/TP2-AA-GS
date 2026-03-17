package livres;

import java.util.List;

public class Serie {
    private String nomDeSerie;
    List<Ouvrage> listeDouvrage;

    public Serie(String nomDeSerie, List<Ouvrage> listeDouvrage) {
        this.nomDeSerie = nomDeSerie;
        this.listeDouvrage = listeDouvrage;
    }

    public String getNomDeSerie() {
        return nomDeSerie;
    }

    public void addOuvrage(Ouvrage ouvrageAajouter) {
        listeDouvrage.add(ouvrageAajouter);
    }

    public void removeOuvrage(Ouvrage ouvrageASupprimer) {
        listeDouvrage.remove(ouvrageASupprimer);
    }


    @Override
    public String toString() {
        return "Serie{" +
                "nomDeSerie='" + nomDeSerie + '\'' +
                ", listeDouvrage=" + listeDouvrage +
                '}';
    }
}
