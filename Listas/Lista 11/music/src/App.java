import Orquestra.BibliotecaMusical;
import Orquestra.Musica;
import Orquestra.MusicaNaoEncontradaException;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        try {
            
            Musica musica1 = new Musica("Bohemian Rhapsody", "Queen", "A Night at the Opera");
            Musica musica2 = new Musica("Stairway to Heaven", "Led Zeppelin", "Led Zeppelin IV");
            Musica musica3 = new Musica("Imagine", "John Lennon", "Imagine");

            
            BibliotecaMusical biblioteca = new BibliotecaMusical();

            
            biblioteca.adicionarMusica(musica1.getTitulo(), musica1);
            biblioteca.adicionarMusica(musica2.getTitulo(), musica2);
            biblioteca.adicionarMusica(musica3.getTitulo(), musica3);

           
            System.out.println("Listando todas as músicas:");
            biblioteca.listarMusicas();

            
            System.out.println("\nBuscando uma música específica:");
            try {
                Musica musicaEncontrada = biblioteca.buscarMusica("Imagine");
                System.out.println(musicaEncontrada);
            } catch (MusicaNaoEncontradaException e) {
                System.out.println(e.getMessage());
            }

            
            System.out.println("\nTentando buscar uma música não existente:");
            try {
                Musica musicaNaoEncontrada = biblioteca.buscarMusica("Nonexistent Song");
                System.out.println(musicaNaoEncontrada);
            } catch (MusicaNaoEncontradaException e) {
                System.out.println(e.getMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
