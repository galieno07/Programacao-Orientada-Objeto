package LOJA;

public class App {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Notebook", 3500.00, 10);
        Produto produto2 = new Produto("Smartphone", 1500.00, 20);

        produto1.Produtos();
        produto2.Produtos();

        Loja Loja = new Loja("Tech Store", "Av. Paulista, 312");

        Loja.adicionarProduto(produto1);
        Loja.adicionarProduto(produto2);

        System.out.println("Produtos disponíveis na loja " + Loja.getNome() + " : ");
        Loja.listarProdutos();
    }
}