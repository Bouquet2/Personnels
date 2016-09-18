package personnel.interne;

import java.util.Date;

/**
 * Created by Valentin on 18/09/2016.
 */
public class Professeur extends EnseignantPermanent{

    public Professeur(String nom, String prenom, String num_sec, Date dateRecrutement, double salaire) throws SalaireIllegalException {
        super(nom, prenom, num_sec, dateRecrutement, salaire);
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
        StringBuilder sb = new StringBuilder("Professeur\n");
        sb.append(super.toString());
        return sb.toString();
    }
}
