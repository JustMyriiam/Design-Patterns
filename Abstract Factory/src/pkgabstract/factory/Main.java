package pkgabstract.factory;

public class Main {

    public static void main(String[] args) {
        AbstractFactory factory1 = new FactoryMoto();

        Client client1 = new Client(factory1);

        client1.afficherVehicules();
        
        System.out.println("................");
        
        AbstractFactory factory2 = new FactoryVoiture();

        Client client2 = new Client(factory2);

        client2.afficherVehicules();
    }
      
}
