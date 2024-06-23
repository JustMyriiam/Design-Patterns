
package pkgabstract.factory;

public class FactoryMoto extends AbstractFactory{
    

    @Override
    public Voiture creerVoiture() {
        return new VoitureElec(150.0, "Rouge", 85.0, "Model S");    
    }

    @Override
    public Moto creerMoto() {
        return new MotoElec(10.0, "Marque", 200.0, 300.0);
    }
    
}
