public class Main {
    public static void main(String[] args) {

        Magasin magasin1 = new Magasin(1, "Carrefour", "Centre-Ville");
        Magasin magasin2 = new Magasin(2, "Monoprix", "Menzah 6");


        magasin1.ajouterEmploye(new Caissier(101, "Ali", "Tunis", 170, 1));
        magasin1.ajouterEmploye(new Vendeurs(102, "Sara", "Ariana", 160, 15.0));
        magasin1.ajouterEmploye(new Responsable(103, "Khaled", "Marsa", 180, 300.0));

        magasin2.ajouterEmploye(new Caissier(201, "Omar", "Menzah", 190, 2));
        magasin2.ajouterEmploye(new Vendeurs(202, "Maya", "Lac", 160, 10.0));
        magasin2.ajouterEmploye(new Responsable(203, "Sami", "Ghammarth", 170, 350.0));

        magasin1.afficherDetails();
        magasin2.afficherDetails();
    }
}