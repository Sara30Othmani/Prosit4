package Emp;

public class Caissier extends Employe{
    private int num_caisse;

    public Caissier(int identifiant, String nom, String adresse, int nbr_heures, int num_caisse){
        this.num_caisse=num_caisse;
    }

    public float calculerSalaire() {
        float sal=0;
        if (this.nbr_heures > 180){
            int nbr_heures_supp = this.nbr_heures - 180 ;
            float prix_Supp= (float) (nbr_heures_supp *(5+(5*0.15)));
            sal= (180 * 5 )+prix_Supp ;

        } else
            sal= (this.nbr_heures * 5 );

        return sal;

    }
}
