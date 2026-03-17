package livres;

public class Pays {
    private String nomPays = "";
    private String codePays = "ERR";

    public Pays(String nom, String codePays) {
        this.nomPays = nom;
        setCodePays(codePays);
    }

    public String getNomPays() {
        return nomPays;
    }

    public String getCodePays() {
        return codePays;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }

    public void setCodePays(String codePays) {
        char check;
        int verifie = 0;

        if (codePays.length() == 3) {
            for (int i = 0; i < codePays.length(); i++) {
                check = codePays.charAt(i);
                if (Character.isUpperCase(check)) {
                    verifie++;
                }
            }

            if (verifie == 3) {
                this.codePays = codePays;
            }
        } else {
            System.out.println("Veuillez entrer 3 caractere en majuscule");
        }
    }
}
