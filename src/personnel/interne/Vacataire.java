package personnel.interne;

import java.util.Date;

/**
 * Created by Valentin on 18/09/2016.
 */
public class Vacataire extends EnseignantTemporaire {

    public Vacataire(String nom, String prenom, String num_sec, Date dateDebutContrat, double salaire, Date dateFinContrat) throws SalaireIllegalException, DateContratIllegalException {
        super(nom, prenom, num_sec, dateDebutContrat, salaire, dateFinContrat);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Ater\n");
        sb.append(super.toString());
        return sb.toString();
    }
}
