
import java.util.Scanner;

public class App {
    
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite : ");
        String palavra1 = scanner.nextLine();
        
        System.out.print("Digite : ");
        String palavra2 = scanner.nextLine();

        compararStrings(palavra1, palavra2);
    
    }

        public static void compararStrings(String plv1, String plv2) {
            if (plv1.equals(plv2)) {
                System.out.println("As palavras são idênticas");
                return;
            } 
            
            if (plv1.equalsIgnoreCase(plv2)) {
                System.out.println("As palavras sao iguais ignorando maiusculo e minusculo");
                return;
            }
        }
    
       
           
    
    
}
