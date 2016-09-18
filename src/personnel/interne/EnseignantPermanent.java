package personnel.interne;

import java.util.Date;

/**
 * Created by Valentin on 18/09/2016.
 */
public abstract class EnseignantPermanent extends Enseignant {

    public EnseignantPermanent(String nom, String prenom, String num_sec, Date dateRecrutement, double salaire) throws SalaireIllegalException {
        super(nom, prenom, num_sec, dateRecrutement, salaire);
    }
}
