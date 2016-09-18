package personnel;

/**
 * Created by Valentin on 18/09/2016.
 */
public abstract class Personnel {

    private String nom;
    private String prenom;
    private String numSec;

    protected Personnel(String nom, String prenom, String num_sec) {
        this.nom = nom;
        this.prenom = prenom;
        this.numSec = num_sec;
    }

    public String getNom() {
        return nom;
    }

    private void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    private void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNum_sec() {
        return numSec;
    }

    private void setNum_sec(String numSec) {
        this.numSec = numSec;
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
        sb.append("Nom : ").append(nom).append("\n");
        sb.append("Nom : ").append(prenom).append("\n");
        sb.append("Nom : ").append(numSec).append("\n");
        return sb.toString();
    }
}
