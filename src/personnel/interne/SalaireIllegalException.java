package personnel.interne;

/**
 * Created by Valentin on 18/09/2016.
 */
class SalaireIllegalException extends Exception {

    SalaireIllegalException(double salaire) {
        super("Le salaire " + salaire + " est incorrect. Le salaire ne peut être négatif");
    }
}
