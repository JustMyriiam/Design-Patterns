public abstract class DecorateurVoiture extends Voiture {
    
    protected Voiture v;  

    
    @Override
    public abstract String getLibelle(); 

    @Override
    public abstract int getPrix();

    @Override
    public abstract int getPoids();
}
