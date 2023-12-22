import java.text.SimpleDateFormat;
import java.util.Date;

public class Personne {
     protected  String nom;
     protected Date dateNaissance;
     protected  double taille;

    public Personne(String nom, Date dateNaissance, double taille) {
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.taille = taille;
    }

    public Personne() {

    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", taille=" + taille +
                '}';
    }

    public void setNom() {
    }

    public void setdateNaissance() {
    }

    public void settaille(int i, int i1) {
    }

    public void setNom(String pape) {
    }

    public void setdateNaissance(int i, int i1, int i2) {
    }
}
