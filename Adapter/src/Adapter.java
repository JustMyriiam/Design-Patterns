
public class Adapter implements Interface{
    
    TV tv;

    public Adapter(TV tv) {
        this.tv = tv;
    }
    
    @Override
    public void afficher(){
        
       System.out.println("TV: "+tv.getTailleEcran()+" pouces");
        
    }
    
}
