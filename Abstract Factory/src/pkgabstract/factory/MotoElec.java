package pkgabstract.factory;


public class MotoElec extends Moto{
    Double capaciteBatterie; // Capacité de la batterie en kWh

    public MotoElec(Double capaciteBatterie, String marque, Double vitesseMax, Double poids) {
        super(marque, vitesseMax, poids);
        this.capaciteBatterie = capaciteBatterie;
    }
    
   
    @Override
    public void featuresDisplay() {
        System.out.println("Caractéristiques de la Moto Électrique :");
        System.out.println("Marque : " + marque);
        System.out.println("Vitesse Maximale : " + vitesseMax + " km/h");
        System.out.println("Poids : " + poids + " kg");
        System.out.println("Capacité de la Batterie : " + capaciteBatterie + " kWh");
    }
}
