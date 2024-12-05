
public class Responsable extends Employe {
    private double prime;

    public Responsable(int identifiant, String nom, String adresse, int nbrHeuresParMois, double prime) {
        super(identifiant, nom, adresse, nbrHeuresParMois);
        this.prime = prime;
    }

    @Override
    public double calculerSalaire() {
        double salaire = getNbrHeuresParMois() * 10.0;
        if (getNbrHeuresParMois() > 160) {
            salaire += (getNbrHeuresParMois() - 160) * 10.0 * 0.20;
        }
        return salaire + prime;
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Prime: " + prime);
    }
}
