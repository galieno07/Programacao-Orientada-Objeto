import java.util.Scanner;

import Loja.NomeInvalidoExcepticon;
import Loja.PrecoInvalidoException;
import Loja.Produtos;

public class App {

   private static Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) {
      do {
         try {
            Produtos produtos = new Produtos(
                  scanner.nextLine(),
                  Integer.parseInt(scanner.nextLine()));

            System.out.println(produtos.getNome());
            System.out.println(produtos.getPreco());
            break;
         } catch (NomeInvalidoExcepticon | PrecoInvalidoException e) {
            System.out.println(e.getMessage());
         } catch (Exception e) {
            System.out.println("Ocorreu um erre, tente novamente!");
         }

      } while (true);
   }
}
