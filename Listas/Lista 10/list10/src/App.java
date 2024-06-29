import locadora.*;
public class App {
    public static void main(String[] args) throws Exception {
        Jogos jogos = new Jogos("God Of War", "Playstation 5");
        Filmes filmes = new Filmes( "Vingadores Guerra Infinita","Joe Russo" ,"Robert Downey jr - Cris Hemsworth - Chris Evans");

        Locadora<AudioVisual> locadora = new Locadora<>();
        locadora.adicionarItem(jogos);
        locadora.adicionarItem(filmes);

        System.out.println("Itens disponíveis na locadora: " );
        locadora.listarItens();

        String tituloBusca = "Vingadores Guerra Infinita";
        AudioVisual itemEncontrado = locadora.buscarItem(tituloBusca);
        if (itemEncontrado != null) {
            System.out.println("Item encontrado: " + itemEncontrado);
        } else {
            System.out.println("Item não encontrado com o título: " + tituloBusca);
        }
    }
}
