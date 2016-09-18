package personnel.externe;

import personnel.Personnel;
import java.util.Date;

/**
 * Created by Valentin on 18/09/2016.
 */
public abstract class Biatos extends Personnel {

    private double salaire;
    private Date dateDebutContrat;
    private Date dateFinContrat;

    public Biatos(String nom, String prenom, String num_sec, double salaire, Date dateDebutContrat, Date dateFinContrat) {
        super(nom, prenom, num_sec);
        this.salaire = salaire;
        this.dateDebutContrat = dateDebutContrat;
        this.dateFinContrat = dateFinContrat;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public Date getDateDebutContrat() {
        return dateDebutContrat;
    }

    public void setDateDebutContrat(Date dateDebutContrat) {
        this.dateDebutContrat = dateDebutContrat;
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
        sb.append("Salaire : ").append(salaire).append("\n");
        sb.append("Date début contrat : ").append(dateDebutContrat.toString()).append("\n");
        sb.append("Date fin contrat : ").append(dateFinContrat.toString()).append("\n");
        return sb.toString();
    }
}
