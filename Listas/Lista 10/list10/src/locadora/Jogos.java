package locadora;

public class Jogos extends AudioVisual {
    private String titulo;
    private String plataforma;

    public Jogos(String titulo, String plataforma) {
        this.titulo = titulo;
        this.plataforma = plataforma;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Nome: " + titulo);
        System.out.println("Plataforma: " + plataforma);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
}
