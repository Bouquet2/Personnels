/**
 * Created by Valentin on 18/09/2016.
 */

import personnel.*;
import personnel.etudiant.*;
import personnel.externe.Bibliothequaire;
import personnel.externe.Secretaire;
import personnel.interne.MaitreDeConference;
import personnel.interne.Professeur;

import java.util.Date;

public class ApplicationPersonnel {

    public static void main(String[] args) {
        System.out.println("Application personnel\n");

        try{
            Personnel p = new Etudiant("Bouquet", "Valentin", "31001989dede", 4150);
            System.out.println(p.toString());

            Personnel p2 = new Doctorant("Albert", "Dupontel", "154d54da4", 3500);
            System.out.println(p2.toString());

            Personnel p3 = new Professeur("Pradat-Peyre", "Jean-François", "554154dada", new Date() , 5400);
            System.out.println(p3.toString());

            Personnel p4 = new MaitreDeConference("Delbot", "François", "dadefrf145", new Date() , 4500);
            System.out.println(p4.toString());

            Personnel p5 = new Bibliothequaire("Daniel", "Smut", "de515d1e", 2500, new Date(), new Date());
            System.out.println(p5.toString());

            Personnel p6 = new Secretaire("Duck", "McCain", "515de15", 3100, new Date(), new Date());
            System.out.println(p6.toString());

        } catch (Exception e) {
            System.out.println("Personnel étudiant exception : " + e);
        }
    }
}
