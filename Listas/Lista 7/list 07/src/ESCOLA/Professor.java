package ESCOLA;

public class Professor extends Usuario {

    private String nome;
    private String email;
    private String disciplina;

    public Professor(String nome, String email, String displina) {
        super(nome, email);
        this.disciplina = disciplina;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Disciplina: " + disciplina);
    }

    public void exibirInfo(boolean exibirNome, boolean exibirEmail, boolean exibirDiciplina) {
        if (exibirNome) {
            System.out.println("Nome: " + nome);
        }
        if (exibirEmail) {
            System.out.println("Email: " + email);
        }
        if (exibirDiciplina) {
            System.out.println("Disciplina: " + disciplina);
        }
    }

    public String getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

}
