package eventos;

public class StandUp extends Evento{
   private String comediante;

    public StandUp(String nome, String local, String data) {
        super(nome, local, data);
        this.comediante = comediante;
    }
    public String getComediante(){
        return comediante;
    }
    public void setComediante(String comediante) {
        this.comediante = comediante;
    }
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Comediante: " + comediante);

    }
    public void comecarEvento() {
        System.out.println("Nosso StandUp jaja vai começar!!!"); 
    }
    public void comecarEvento(String piada){
        System.out.println("Antes de começarmos que tal uma piada: " + piada);
        
    }

   
}
