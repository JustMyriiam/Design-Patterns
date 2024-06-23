
package template;


public class The extends BoissonCafeinee{
    
    private String supplement;

    public The(String supplement) {
        this.supplement = supplement;
    }
    
    
    void preparer() {
        System.out.println("Le Thé est préparé");
    }
    
    void ajouterSupplements() {
        System.out.println("Les suppléments propres au Thé sont ajoutés: "+this.supplement);
    }
    
    
}
