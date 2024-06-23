
public class Main {
    public static void main(String[] args) {
        
         // Laptop
        Interface laptop = new Laptop("Dell");
        laptop.afficher();
        System.out.println(".....................");
        // Adapter pattern
        TV tv = new TV(55);
        Interface adapter = new Adapter(tv);
        adapter.afficher();
    }
}
