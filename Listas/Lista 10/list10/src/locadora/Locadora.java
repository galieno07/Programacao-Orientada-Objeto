package locadora;


    import java.util.ArrayList;
import java.util.List;

public class Locadora<T extends AudioVisual> {
    private List<T> acervo;

    public Locadora() {
        this.acervo = new ArrayList<>();
    }

    public void adicionarItem(T item) {
        acervo.add(item);
    }

    public void listarItens() {
        for (T item : acervo) {
            System.out.println(item);
        }
    }

    public T buscarItem(String titulo) {
        for (T item : acervo) {
            if (item.getTitulo().equals(titulo)) {
                return item;
            }
        }
        return null;
    }
}

