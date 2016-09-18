package personnel.interne;

import java.util.Date;

/**
 * Created by Valentin on 18/09/2016.
 */
public abstract class EnseignantTemporaire extends Enseignant{

    private Date dateFinContrat;

    public EnseignantTemporaire(String nom, String prenom, String num_sec, Date dateDebutContrat, double salaire, Date dateFinContrat) throws SalaireIllegalException, DateContratIllegalException {
        super(nom, prenom, num_sec, dateDebutContrat, salaire);

        if(dateFinContrat.compareTo(dateDebutContrat) <= 0) {
            throw new DateContratIllegalException(dateDebutContrat, dateFinContrat);
        } else {
            this.dateFinContrat = dateFinContrat;
        }
    }

    public Date getDateFinContrat() {
        return dateFinContrat;
    }

    public void setDateFinContrat(Date dateFinContrat) {
        this.dateFinContrat = dateFinContrat;
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
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Date fin contrat :").append(dateFinContrat.toString()).append("\n");
        return sb.toString();
    }
}
