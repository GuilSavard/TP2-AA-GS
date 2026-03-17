/**
 * CoursPOO 1
 *
 * @author AA&&GS
 * @since H25
 */
package livres;


import java.time.LocalDate;

public class OuvrageAudio extends Ouvrage {

    public enum Format {
        Numerique, Analogique
    }

    public Format formatdefault = Format.Analogique;
    public int duree = 0;


    public OuvrageAudio(String titre, Auteur auteur, LocalDate date, int nombreExemplaires, int duree, Format type) {
        super(titre, auteur, date, nombreExemplaires);
        setDuree(duree);
        setFormatdefault(type);
    }

    public OuvrageAudio(String titre, Auteur auteur, int duree, Format type) {
        super(titre, auteur);
        setDuree(duree);
        setFormatdefault(type);
    }

    public Format getFormatdefault() {
        return formatdefault;
    }

    public void setFormatdefault(Format formatdefault) {
        this.formatdefault = formatdefault;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }
}
