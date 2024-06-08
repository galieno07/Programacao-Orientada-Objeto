package ESCOLA;

public class Usuario {

    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String Gmail, Usuario usuario) {
        this.email = email;
    }

    public void exibirInfo() {

        System.out.println("Nome: " + nome);
        System.out.println("email: " + email);
    }
}
