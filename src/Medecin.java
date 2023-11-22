import java.util.Objects;

public class Medecin {
    private int cin;
    private String nom;
    private String prenom;
    private int numOrdre;

    public Medecin(int cin, String nom, String prenom, int numOrdre) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.numOrdre = numOrdre;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNumOrdre() {
        return numOrdre;
    }

    public String toString() {
        /*à completer*/
        return "cin=" + cin + ", nom=" + nom + ", prenom=" + prenom + ", num Ordre=" + numOrdre + "]";
    }

    public boolean equals(Object obj) {
        /*à completer*/
        if(obj == this)
            return true;

        if(!(obj instanceof Medecin))
            return false;

        Medecin m = (Medecin) obj;
        return this.cin == m.getCin();
    }


}
