package locadora;

import java.util.List;

public class Filmes extends AudioVisual {
    private String titulo;
    private String diretor;
    private List<String> atores;

    public Filmes(String titulo, String diretor, String string) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.atores = atores;
    }

    public void exibirInfo() {
        System.out.println(" Filme: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Envolvidos: " + atores);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public List<String> getAtores() {
        return atores;
    }

    public void setAtores(List<String> atores) {
        this.atores = atores;
    }

}
