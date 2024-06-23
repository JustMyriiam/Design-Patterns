package pkgabstract.factory;


public abstract class Moto{
    
    String marque;
    Double vitesseMax; // Vitesse maximale en km/h
    Double poids; // Poids de la moto en kg

    public Moto(String marque, Double vitesseMax, Double poids) {
        this.marque = marque;
        this.vitesseMax = vitesseMax;
        this.poids = poids;
    }
    
    
    public abstract void featuresDisplay();
}
