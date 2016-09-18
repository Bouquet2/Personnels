package personnel.interne;

import java.util.Date;

/**
 * Created by Valentin on 18/09/2016.
 */
public class DateContratIllegalException extends Exception {

    DateContratIllegalException(Date debut, Date fin) {
        super( "La date du début du contrat " + debut.toString() + " et la date de fin du contrat " + fin.toString() +
                " ne concorde pas.");
    }
}
