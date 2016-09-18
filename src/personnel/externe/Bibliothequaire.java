package personnel.externe;

import java.util.Date;

/**
 * Created by Valentin on 18/09/2016.
 */
public class Bibliothequaire extends Biatos{

    public Bibliothequaire(String nom, String prenom, String num_sec, double salaire, Date dateDebutContrat, Date dateFinContrat) {
        super(nom, prenom, num_sec, salaire, dateDebutContrat, dateFinContrat);
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
        StringBuilder sb = new StringBuilder("Bibliothécaire\n");
        sb.append(super.toString());
        return sb.toString();
    }
}
