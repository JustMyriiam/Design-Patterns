
public class Corsa extends Voiture{

    public Corsa(String libelle, int prix, int poids) {
        super(libelle, prix, poids);
    }

    

    @Override
    public String getLibelle() {
        return libelle;
    }

    @Override
    public int getPrix() {
        return prix;
    }

    @Override
    public int getPoids() {
        return poids;
    }

    @Override
    public String toString() {
        return "Corsa: " + super.toString();
    }
}
