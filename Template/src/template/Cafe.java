
package template;


public class Cafe extends BoissonCafeinee{
    
    private String supplement;
    
    public Cafe(String supplement) {
        this.supplement = supplement;
    }
    
    void preparer() {
        System.out.println("Le café est préparé");
    }
    
    void ajouterSupplements() {
        System.out.println("Les suppléments propres au café sont ajoutés: "+supplement);
    }
    
}
