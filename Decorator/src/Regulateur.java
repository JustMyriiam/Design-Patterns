
public class Regulateur extends DecorateurVoiture {

    public Regulateur(Voiture v) {
        this.v = v;
    }

 
    
    public String getLibelle() {
     return v.getLibelle()+" avec Regulateur";

    }

    @Override
    public int getPrix() {
             return v.getPrix()+700;
    }

    
    @Override
    public int getPoids() {
        return v.getPoids()+70;
    }

    @Override
    public String toString() {
        return "Voiture{" + "Libelle: " + this.getLibelle() + " ,Prix: " + this.getPrix() + " ,Poids: " + this.getPoids() + '}';
    }
    
  
    
}
