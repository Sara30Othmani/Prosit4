package Emp;

public class Employe {

    int identifiant;
    String nom;
    String adresse;
    int nbr_heures;

    public Employe(){
    }

    public Employe(int identifiant, String nom, String adresse, int nbr_heures){
        this.identifiant=identifiant;
        this.nom=nom;
        this.adresse=adresse;
        this.nbr_heures=nbr_heures;
    }


    public String toString() {
        return "identifiant :"+identifiant+"nom :"+nom+"adresse :"+adresse+"nombre heures :"+nbr_heures;
    }
}
