package personnel.etudiant;

/**
 * Created by Valentin on 18/09/2016.
 */
class BourseIllegalException extends Exception {

    BourseIllegalException(double bourse) {
        super(  "Bourse, saisie invalide : " + bourse + "\n" +
                "Le montant doit être comprise entre " + Etudiant.bourse_min + " et " + Etudiant.bourse_max + ".\n");
    }
}
