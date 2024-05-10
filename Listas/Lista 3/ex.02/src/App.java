import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ano de nascimento: ");
        int anoNacimento = scanner.nextInt();

        int idade= calcularIdade(anoNacimento);


        System.out.printf("Até o final de 2024 você terá %d anos\n", idade);

    }
    public static int calcularIdade(int anoNacimento){
        int anoAtual = 2024;
        return anoAtual - anoNacimento;
    }

}
