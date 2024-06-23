
package template;

public class BoissonTest {
    
     public static void main(String[] args) {
         
         
         BoissonCafeinee cafe = new Cafe("Crème Aromatisé");
         BoissonCafeinee the = new The("Citron");
         
         System.out.println("Création du Café.....");
         cafe.suivreRecette();
         
         System.out.println("-------------------");

         System.out.println("Création du Thé.....");
         the.suivreRecette();
         

    }
    
}
