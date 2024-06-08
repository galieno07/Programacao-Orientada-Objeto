import ESCOLA.Usuario;
import ESCOLA.Aluno;
import ESCOLA.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno = new Aluno("Cezar Gomes", "cezargomes21@gmail.com", "44252\n");
        Professor professor = new Professor("Miguel Silva", "miguelitosil51@gmail.com", "POO");

        aluno.exibirInfo();
        professor.exibirInfo();
    }
}
