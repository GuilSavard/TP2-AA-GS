/**
 * CoursPOO 1
 *
 * @author AA&&GS
 * @since H25
 */
package livres;

import java.time.LocalDate;

public class OuvragePapier extends Ouvrage {

    private int nbPages = 0;

    public OuvragePapier(String titre, Auteur auteur, LocalDate date, int nombreExemplaires, int pages){
        super(titre, auteur, date, nombreExemplaires);
        setNbPages(pages);
    }

    public OuvragePapier(String titre, Auteur auteur, int pages){
        super(titre, auteur);
        setNbPages(pages);
    }

    public int getNbPages() {
        return nbPages;
    }

    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }
}
