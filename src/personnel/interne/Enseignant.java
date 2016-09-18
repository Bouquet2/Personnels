package personnel.interne;

import personnel.Personnel;
import java.util.Date;

/**
 * Created by Valentin on 18/09/2016.
 */
public abstract class Enseignant extends Personnel{

    private Date dateDebutContrat;
    private double salaire;

    protected Enseignant(String nom, String prenom, String num_sec, Date dateDebutContrat, double salaire) throws SalaireIllegalException{
        super(nom, prenom, num_sec);
        if(salaire < 0) {
            throw new SalaireIllegalException(salaire);
        } else {
            this.dateDebutContrat = dateDebutContrat;
            this.salaire = salaire;
        }
    }

    public Date getDateRecrutement() {
        return dateDebutContrat;
    }

    private void setDateRecrutement(Date dateRecrutement) {
        this.dateDebutContrat = dateRecrutement;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
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
        sb.append("Salaire : ").append(salaire).append("\n");
        sb.append("Date début contrat : ").append(dateDebutContrat.toString()).append("\n");
        return sb.toString();
    }
}
