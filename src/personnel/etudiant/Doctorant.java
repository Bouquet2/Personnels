package personnel.etudiant;

/**
 * Created by Valentin on 18/09/2016.
 */
public class Doctorant extends Etudiant{

    public Doctorant(String nom, String prenom, String num_sec, double bourse) throws BourseIllegalException{
        super(nom, prenom, num_sec, bourse);
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
        StringBuilder sb = new StringBuilder("Doctorant ");
        sb.append(super.toString());
        return sb.toString();
    }
}
