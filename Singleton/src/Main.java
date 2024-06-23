public class Main {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        System.out.println("Le singleton 1 est:\t"+ s1);
        
        // tester avec un autre singleton
        Singleton s2 = Singleton.getInstance();
        System.out.println("Le singleton 2 est:\t"+ s2);
    }
}