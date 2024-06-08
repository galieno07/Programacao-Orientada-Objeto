package ESCOLA;

public class Aluno extends Usuario {

    private String matricula;
    private String nome;
    private String email;

    public Aluno(String nome, String email, String matricula) {
        super(nome, email);
        this.matricula = matricula;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Matrícula: " + matricula);

    }

    public void exibirInfo(boolean exibirNome, boolean exibirEmail, boolean exibirMatricula) {

        if (exibirNome) {
            System.out.println("Nome: " + nome);
        }
        if (exibirEmail) {
            System.out.println("Email: " + email);
        }
        if (exibirMatricula) {
            System.out.println("Matricula: " + matricula);
        }

    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
