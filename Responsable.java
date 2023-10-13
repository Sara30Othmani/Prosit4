package Emp;

public class Responsable extends Employe{
    private int prime;
    public Responsable(int identifiant, String nom, String adresse, int nbr_heures, int prime){
        this.prime=prime;
    }

    public float calculerSalaire() {
        float sal = 0;
        if (this.nbr_heures > 160) {
            int nbr_heures_supp = this.nbr_heures - 160;
            float prix_Supp = (float) (nbr_heures_supp * (10 + (10 * 0.2)));
            sal = (160 * 10) + prix_Supp + prime;

        } else {
            sal = (this.nbr_heures * 10) + prime;
        }

        return sal;

    }
}
