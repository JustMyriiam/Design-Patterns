
public abstract class Voiture {
    
    String libelle;
    int prix;
    int poids;

    public Voiture() {
    }

    
    public Voiture(String libelle, int prix, int poids) {
        this.libelle = libelle;
        this.prix = prix;
        this.poids = poids;
    }

    
    public abstract  String getLibelle() ;

    public abstract int getPrix();

    public abstract int getPoids() ;

    @Override
    public String toString() {
        return "Voiture{" + "Libelle: " + getLibelle() + ", Prix: " + getPrix() + ", Poids: " + getPoids() + '}';
    }

  
   
    
    
    
}
