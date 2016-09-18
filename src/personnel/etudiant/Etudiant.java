package personnel.etudiant;

import personnel.Personnel;

/**
 * Created by Valentin on 18/09/2016.
 */
public class Etudiant extends Personnel {

    private double bourse;
    final static double bourse_min = 0;
    final static double bourse_max = 5551;

    public Etudiant(String nom, String prenom, String num_sec, double bourse) throws BourseIllegalException{
        super(nom, prenom, num_sec);
        if(bourse < bourse_min || bourse > bourse_max) {
            throw new BourseIllegalException(bourse);
        } else {
            this.bourse = bourse;
        }
    }

    public double getBourse() {
        return bourse;
    }

    /*
   Exception si la bourse est inférieur ou supérieur au bourse_min & bourse_max
     */
    public void setBourse(double bourse) throws BourseIllegalException{
        if(bourse < bourse_min || bourse < bourse_max) {
            throw new BourseIllegalException(bourse);
        } else {
            this.bourse = bourse;
        }
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
        StringBuilder sb = new StringBuilder("Etudiant\n");
        sb.append(super.toString());
        sb.append("Bourse : ").append(bourse).append("\n");
        return sb.toString();
    }
}
