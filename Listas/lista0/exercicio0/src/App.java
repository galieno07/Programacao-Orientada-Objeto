import java.util.Scanner;

public class App {
  
     
       
        static int[] numeros = new int[10];
    
       
        static void preencherVetor() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite 10 números:");
            for (int i = 0; i < 10; i++) {
                numeros[i] = scanner.nextInt();
            }
        }
    
    
        static boolean buscarNumero(int num) {
            for (int i = 0; i < 10; i++) {
                if (numeros[i] == num) {
                    return true;
                }
            }
            return false;
        }
    
        public static void main(String[] args) {
          
            preencherVetor();
    
           
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite um número para busca:");
            int numeroBusca = scanner.nextInt();
    
            
            boolean encontrado = buscarNumero(numeroBusca);
    
          
            if (encontrado) {
                System.out.println("ACHEI");
            } else {
                System.out.println("NAO ACHEI");
            }
        }
    }

   

