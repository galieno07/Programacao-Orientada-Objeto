package ANIMAIS;

public class GATO implements ANIMAL {
    private String nome;
    private int idade;

    public GATO(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public void comer() {
        System.out.println("O gato " + nome + " está comendo ração.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O gato " + nome + " faz: Miau!");
    }
}