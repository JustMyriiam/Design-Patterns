
package pkgabstract.factory;

/**
 *
 * @author ASUS
 */
public abstract class Voiture {
    String couleur;
    Double puiss;
    String modele;

    public Voiture(String couleur, Double puiss, String modele) {
        this.couleur = couleur;
        this.puiss = puiss;
        this.modele = modele;
    }
    
    
    public abstract void featuresDisplay();
    
    
}
