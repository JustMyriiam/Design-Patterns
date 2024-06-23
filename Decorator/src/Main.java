
public class Main {
    
    
    public static void main(String[] args) {
        
        Voiture c1 = new Corsa("first car", 5000, 450);
        System.out.println("Sans options");
        System.out.println(c1.toString());
        c1 = new Regulateur(c1);
        
        System.out.println("Avec options");
        System.out.println(c1.toString());
     
        c1 = new ToitOuvrant(c1);
        System.out.println(c1.toString());

        c1 = new GPS(c1);
        System.out.println(c1.toString());
        
        // c2
        System.out.println("..................");
        Voiture c2 = new C2("second car", 50, 40);
        System.out.println("Sans options");
        System.out.println(c2.toString());
        c2 = new Regulateur(c2);
        
        System.out.println("Avec options");
        System.out.println(c2.toString());
    }
}
