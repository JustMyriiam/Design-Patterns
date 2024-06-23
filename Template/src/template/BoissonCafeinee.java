
package template;

public abstract class BoissonCafeinee {
    
    final void suivreRecette () {
        faireBouillirEau();
        preparer();
        verserDansTasse();
        ajouterSupplements();
    } 
    
    abstract void preparer();
    abstract void ajouterSupplements();
    
    private void faireBouillirEau() {
        System.out.println("L'eau est bouilli");
    }
    
    private void verserDansTasse() {
        System.out.println("Le boisson est versé dans la tasse");
    }
}
