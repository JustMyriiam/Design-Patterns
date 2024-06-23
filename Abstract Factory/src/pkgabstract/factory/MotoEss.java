
package pkgabstract.factory;

public class MotoEss extends Moto{
 Double capaciteReservoir; // Capacité du réservoir en litres

    public MotoEss(Double capaciteReservoir, String marque, Double vitesseMax, Double poids) {
        super(marque, vitesseMax, poids);
        this.capaciteReservoir = capaciteReservoir;
    }
    

    @Override
    public void featuresDisplay() {
        System.out.println("Caractéristiques de la Moto à Essence :");
        System.out.println("Marque : " + marque);
        System.out.println("Vitesse Maximale : " + vitesseMax + " km/h");
        System.out.println("Poids : " + poids + " kg");
        System.out.println("Capacité du Réservoir : " + capaciteReservoir + " litres");
    }
}
