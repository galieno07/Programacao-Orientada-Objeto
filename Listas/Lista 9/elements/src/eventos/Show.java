package eventos;

import java.util.Arrays;
import java.util.List;

public class Show extends Evento {

    private List<String> artistas;
    
    public Show(String nome, String local, String data, List<String> artistas) {
        super(nome, local, data);
        this.artistas = artistas;
    }
    
    public List<String> getArtista(){
        return artistas;
    }
    public void setArtista(List<String> artista) {
        this.artistas = artistas;
    }
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Artista: " + artistas);
    }

    public void comecarEvento(){
        System.out.println("O SHOW ira começar!! Peguem seus lugares");
    }
    public void comecarEvento(boolean comAplausos){
        if (comAplausos) {
            System.out.println("CLAP CLAP CLAP CLAP!!!");
        }
        
    }

   
    
}
