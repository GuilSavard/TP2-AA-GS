package tests;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import livres.*;


/**
 * CoursPOO 1
 *
 * @author Julien.Brunet màj Jocelyn
 * @since H25
 */
public class TestOuvrage {

    public static void main(String[] args) {
        TestOuvrage test = new TestOuvrage();
        test.testOuvrages();
        test.testTrouver();
        test.test_Pays();
    }


    public void testOuvrages() {

        //Deux auteurs deja prets pour les tests...
        Auteur albertine = new Auteur("Albertine", "Tremblay", "Canada");
        Auteur john = new Auteur("John", "Smith", "Etats-Unis");

        //Voici une partie des tests! Il faut en ajouter, pour les fonctionnalités non testées!
        System.out.println("-----Test des constructeurs d'ouvrage et des diverses validations-----------");
        Ouvrage livreA = new OuvrageVideo("Titre assez long", john);
        System.out.println(livreA);
        Ouvrage livreB = new OuvrageVideo("Ti", john);
        System.out.println(livreB);
        Ouvrage livreC = new OuvrageVideo(null, john);
        System.out.println(livreC);

        //bibliotheque.Auteur null et valeur par défaut de l'bibliotheque.Auteur
        Ouvrage livreA1 = new OuvrageVideo("Titre assez long", null);
        System.out.println(livreA1);
        //bibliotheque.Auteur fonctionnel
        Ouvrage livre1 = new OuvrageVideo("Tout va bien", albertine);
        System.out.println(livre1);

        //Date null et valeur par défaut de la date
        livre1.setDate(null);
        System.out.println(livre1);
        livre1.setDate(LocalDate.now().minusYears(5));
        System.out.println(livre1);

        //Test de la validation sur le nb d'exemplaires (valide et non valide)
        Ouvrage livre2 = new OuvrageVideo("Tout va bien", albertine, LocalDate.now(), -10);
        System.out.println(livre2);

        livre2 = new OuvrageVideo("Tout va bien", albertine, LocalDate.now(), 20);
        System.out.println(livre2);

        System.out.println("\n-----Tests des méthodes acheter et vendre-----------");

        Ouvrage livre3 = new OuvrageVideo("Musique du hasard", new Auteur("Paul", "Auster", "Etats-Unis"), LocalDate.now(), 5);
        System.out.println(livre3);

        livre3.acheter(5);
        System.out.println(livre3);

        System.out.println("On peut vendre 8 livres? " + livre3.vendre(8));
        System.out.println(livre3);

        System.out.println("On peut vendre 10 livres? " + livre3.vendre(10));
        System.out.println(livre3);

        Ouvrage livre4 = new OuvrageVideo("Test", new Auteur("A", "B", "Etats-Unis"), LocalDate.now(), 5);

        System.out.println("\n-----Tests de la  méthode equals()-----------");
        //Deux ouvrages égaux
        Ouvrage livre5 = new Ouvrage("Test", new Auteur("A", "B", "Etats-Unis"), Ouvrage.Format.PAPIER, null, 5);
        Ouvrage livre6 = new Ouvrage("Test", new Auteur("A", "B", "Etats-Unis"), Ouvrage.Format.PAPIER, LocalDate.now(), 10);
        //Un qui ne l'est pas
        Ouvrage livre7 = new Ouvrage("Test", new Auteur("Z", "B", "Etats-Unis"), Ouvrage.Format.PAPIER, LocalDate.now(), 5);

        System.out.println("Test de la méthode equals d'bibliotheque.Ouvrage:" + livre4.equals(livre5));
        System.out.println("Test de la méthode equals d'bibliotheque.Ouvrage:" + livre4.equals(livre6));
        System.out.println("Test de la méthode equals d'bibliotheque.Ouvrage:" + !livre4.equals(livre7));
        System.out.println("Test de la méthode equals d'bibliotheque.Ouvrage:" + !livre4.equals(john));
        System.out.println("Test de la méthode equals d'bibliotheque.Ouvrage:" + !livre4.equals(null));
        System.out.println("Test de la méthode equals d'bibliotheque.Ouvrage:" + !livre4.equals("Test"));



        System.out.println("\n-----Tests de la  méthode testSerie()-----------");
        testSerie();

    }


    private void testTrouver() {
        Librairie bibliotheque = new Librairie();
        Auteur john = bibliotheque.getAuteurs().get(1);

        System.out.println("\n-----Test de votre méthode trouverOuvrage-----------");
        List<Ouvrage> resultat = bibliotheque.trouverOuvrages(new Auteur("Albertine", "Tremblay", "Canada"));
        System.out.println("Livres de albertine: " + resultat);

        resultat = bibliotheque.trouverOuvrages(john);
        System.out.println("Livres de john: " + resultat);

        resultat = bibliotheque.trouverOuvrages(new Auteur("Jacques", "Beaulieu", "France"));
        System.out.println("Livres de Jacques: " + resultat);
    }



    public void test_Pays() {
//test_Sans_Erreur
        Pays pays1 = new Pays("France", "FRA");
        //Test_d erreur
        Pays pays2 = new Pays("Canada", "Can");

        Auteur albertine = new Auteur("Albertine", "Tremblay", pays1);
        System.out.println(albertine);
        Auteur john = new Auteur("John", "Smith", pays2);
        System.out.println(john);


    }

    private void testSerie() {
        Auteur john = new Auteur("John", "Smith", "Etats-Unis");
        Ouvrage livreA = new OuvrageVideo("Titre assez long", john);

        Ouvrage livreB = new OuvrageVideo("Titre me fait chier", john);

        Ouvrage livreC = new Ouvrage("disparait dans des papillions", john);

        Ouvrage livreD = new Ouvrage("La quete d'un oposssum", john);

        ArrayList<Ouvrage> fuckThisShit = new ArrayList<Ouvrage>();
        fuckThisShit.add(livreA);
        fuckThisShit.add(livreB);
        fuckThisShit.add(livreC);

        Serie help= new Serie("helpMe", fuckThisShit);
        help.addOuvrage(livreD);
        System.out.println(help);
        help.removeOuvrage(livreC);
        System.out.println(help);


    }


}

