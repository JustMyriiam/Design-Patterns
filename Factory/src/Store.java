
public class Store {

    public Store() {
    }

    public void ordonnerKnife(int number, String type) {
        Factory f = new Factory();
        for (int i = 1; i <= number; i++) {
            Knife K = f.create(type);
            System.out.println("Knife n°" + i);
            K.aiguiser();
            K.polir();
            K.emballer();
        }
    }

    public static void main(String[] args) {
        Store s = new Store();
        s.ordonnerKnife(2, "CheeseKnife");
        System.out.println("Nouvelle Commande");
        s.ordonnerKnife(2, "SteakKnife");
        System.out.println("Nouvelle Commande");
        s.ordonnerKnife(1, "Cheese");

    }

}
