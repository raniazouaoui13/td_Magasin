
import java.util.ArrayList;
import java.util.List;
public class GestionnaireMagasin {
    private List<Magasin> magasin;

    // Constructeur
    public GestionnaireMagasin() {
        this.magasin = new ArrayList<>();
    }

    // Ajouter un magasin
    public void ajouterMagasin(Magasin mg) {
        magasin.add(mg);
    }



}

