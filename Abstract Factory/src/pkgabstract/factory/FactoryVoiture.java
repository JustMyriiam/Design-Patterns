
package pkgabstract.factory;


public class FactoryVoiture extends AbstractFactory{

    @Override
    public Voiture creerVoiture() {
        return new VoitureEss(8.5, "Noir", 200.0, "X5"); 
    }

    @Override
    public Moto creerMoto() {
        return new MotoEss(15.0, "MarqueMoto", 180.0, 250.0); 
    }
    
}
