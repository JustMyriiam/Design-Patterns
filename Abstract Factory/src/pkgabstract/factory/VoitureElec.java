
package pkgabstract.factory;


public class VoitureElec extends Voiture {
    Double capaciteBatterie; 

    public VoitureElec(Double capaciteBatterie, String couleur, Double puiss, String modele) {
        super(couleur, puiss, modele);
        this.capaciteBatterie = capaciteBatterie;
    }

    

    @Override
    public void featuresDisplay() {
        System.out.println("Caractéristiques de la Voiture Électrique :");
        System.out.println("Couleur : " + couleur);
        System.out.println("Puissance : " + puiss + " kW");
        System.out.println("Modèle : " + modele);
        System.out.println("Capacité de la Batterie : " + capaciteBatterie + " kWh");

    }

}
