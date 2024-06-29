package Loja;

public class Produtos {
    private String nome;
    private Double preco;

   public Produtos(String nome, double preco)throws NomeInvalidoExcepticon, PrecoInvalidoException {
        setNome(nome);
        setpreco(preco);   
    }

    public void setNome(String nome) throws NomeInvalidoExcepticon{
        if (!nome.isBlank()) {
            this.nome = nome;
            return;
        }
        throw new NomeInvalidoExcepticon();
    }
    public String getNome(){
        return this.nome;
    }

    public void setpreco( double preco) throws PrecoInvalidoException{
        if (preco >= 0) {
            this.preco = preco;
            return;
        }
        throw new PrecoInvalidoException();
    }

        public Double getPreco(){
            return this.preco;
        }


}
