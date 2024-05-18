public class Identidade {
    String nome;
    int idade;
    
    boolean genero;

    public void servir(){
        
        if ( genero == masculino && idade >= 18)  {
            System.out.println("Se apresente para o alistamento para o exercito");
        }
        else{
            System.out.println("Aguarde mais um momento para se alisatar");
        }
    }
}
