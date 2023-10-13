package Emp;

public class Test {

    public static void main(String[] args){

        Caissier c1 = new Caissier(1, "Sara", "El Ghazela",18, 9);

        Caissier c2 = new Caissier(2, "Siwar", "Manouba",21, 24);

        Vendeur v1 = new Vendeur (3, "Ali", "Ariana", 14, 12);

        Responsable r1 = new Responsable(4, "Chokri", "Riadh Andalos", 22, 10);

        Carrefour.add(c1);
        Carrefour.add(c2);
        Carrefour.add(v1);
        Carrefour.add(r1);

    }
}
