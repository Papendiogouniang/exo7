public class Main {
    public static void main(String[] args) {

        Employe employe = new Employe();

       employe.setSalaire(3445667);
        employe.setPoste("DEV");

        System.out.println(employe.toString());

       Personne personne = new Personne();
       personne.setNom("PAPE");
       personne.setdateNaissance(29,9,2000);
       personne.settaille(1,10);
    }
}