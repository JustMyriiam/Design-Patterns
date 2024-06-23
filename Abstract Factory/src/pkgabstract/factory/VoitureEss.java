
package pkgabstract.factory;

public class VoitureEss extends Voiture{
    Double consommation;  // Consommation de carburant en litres/100 km

    public VoitureEss(Double consommation, String couleur, Double puiss, String modele) {
        super(couleur, puiss, modele);
        this.consommation = consommation;
    }

    @Override
    public void featuresDisplay() {
        System.out.println("Caractéristiques de la Voiture à Essence :");
        System.out.println("Couleur : " + couleur);
        System.out.println("Puissance : " + puiss + " CV");
        System.out.println("Modèle : " + modele);
        System.out.println("Consommation : " + consommation + " L/100 km");
    }
}
