
public class ToitOuvrant extends DecorateurVoiture {

    Voiture v;
    public ToitOuvrant(Voiture v) {
        
        this.v = v;
    }

    
    
    @Override
    public String getLibelle() {
     return v.getLibelle()+" avec Toit Ouvrant";

    }

    @Override
    public int getPrix() {
             return v.getPrix()+2010;
    }

    
    @Override
    public int getPoids() {
        return v.getPoids()+20;
    }
    
    

}
