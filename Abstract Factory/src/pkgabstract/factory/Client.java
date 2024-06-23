
package pkgabstract.factory;

public class Client {
    
    private Voiture voiture;
    private Moto moto;

    public Client(AbstractFactory factory) {
       voiture = factory.creerVoiture();
       moto = factory.creerMoto();
    }
    
     public void afficherVehicules() {
        if (voiture != null) {
            System.out.println("Voiture créée >>");
            voiture.featuresDisplay();
        } else {
            System.out.println("Aucune voiture n'a été créée.");
        }
        
        if (moto != null) {
            System.out.println("Moto créée >>");
            moto.featuresDisplay();
        } else {
            System.out.println("Aucune moto n'a été créée.");
        }
    }

}
