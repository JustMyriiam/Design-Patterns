
public class Laptop implements Interface{
    
    private String marque;
    
    public Laptop(String marque) {
        this.marque = marque;
    }
    
    @Override
    public void afficher() {
        System.out.println("Laptop: " + marque);
        
    }
}
