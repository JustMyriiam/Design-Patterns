
public class GPS extends DecorateurVoiture {
    
    public GPS(Voiture v) {
        this.v = v;
    }
    
     public String getLibelle() {
     return v.getLibelle()+" avec GPS";

    }

    @Override
    public int getPrix() {
             return v.getPrix()+500;
    }

    
    @Override
    public int getPoids() {
        return v.getPoids()+20;
    }
    
}
