package Orquestra;

import java.util.HashMap;
import java.util.Map;

public class BibliotecaMusical {

    private Map<String, Musica> acervo;

  
    public BibliotecaMusical() {
        this.acervo = new HashMap<>();
    }

    
    public void adicionarMusica(String titulo, Musica musica) {
        acervo.put(titulo, musica);
    }

    public void listarMusicas() {
        if (acervo.isEmpty()) {
            System.out.println("A biblioteca não possui músicas.");
        } else {
            for (Map.Entry<String, Musica> entrada : acervo.entrySet()) {
                System.out.println(entrada.getValue());
            }
        }
    }

    public Musica buscarMusica(String titulo) throws MusicaNaoEncontradaException {
        if (acervo.containsKey(titulo)) {
            return acervo.get(titulo);
        } else {
            throw new MusicaNaoEncontradaException(titulo);
        }
    }

  
    public Map<String, Musica> getAcervo() {
        return acervo;
    }

    public void setAcervo(Map<String, Musica> acervo) {
        this.acervo = acervo;
    }

}
