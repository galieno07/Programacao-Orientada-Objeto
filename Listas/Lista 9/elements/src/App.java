import java.util.Arrays;
import java.util.List;

import eventos.*;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> listaArtistas = Arrays.asList("50Cent", "Pericles", "Leo Santana");
        Show show = new Show("Role Aleatorio", "Maracanã", "14/07/2024", listaArtistas);
        show.comecarEvento(true);
        show.comecarEvento();
        show.exibirInformacoes();

    }
}
