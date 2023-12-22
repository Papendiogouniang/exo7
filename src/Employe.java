import java.util.Date;

public class Employe extends Personne {
    public Employe(String nom, Date dateNaissance, double taille) {
        super(nom, dateNaissance, taille);
    }

    private double salaire;
    private  String poste;

    public Employe(String nom, Date dateNaissance, double taille, double salaire, String poste) {
        super(nom, dateNaissance, taille);
        this.salaire = salaire;
        this.poste = poste;
    }

    public Employe() {
        super();
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "salaire=" + salaire +
                ", poste='" + poste + '\'' +
                ", nom='" + nom + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", taille=" + taille +
                '}';
    }
}
