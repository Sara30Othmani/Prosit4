package Emp;

public class Vendeur extends Employe{
    private final float taux_vente;

    public Vendeur(int identifiant, String nom, String adresse, int nbr_heures, int taux_vente){
        this.taux_vente=taux_vente;
    }

    public float calculerSalaire() {

        return (450 * taux_vente )/100;
    }

}
