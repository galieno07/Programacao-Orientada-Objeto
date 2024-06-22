package eventos;

public abstract class Evento {

    private String nome;
    private String local;
    private String data;

    public Evento(String nome, String local, String data) {
        this.nome = nome;
        this.local = local;
        this.data = data;
    }

    public void exibirInformacoes() {
        System.out.println("Nome do evento: " + nome);
        System.out.println("Local do evento: " + local);
        System.out.println("Data do evento: " + data);
    }

    public abstract void comecarEvento();

    public String getNome() {
        return nome;
    }

    public void setNome() {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal() {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData() {
        this.data = data;
    }

}
