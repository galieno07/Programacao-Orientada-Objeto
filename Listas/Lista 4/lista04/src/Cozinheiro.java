public class Cozinheiro {
    int nivelHabilidade;
    int força;
    String nome;

    public void cortesDeAlimentos(){
        System.out.println("mão na massa força nesses braços");
        }
    
    public void vaAteOhFinal(){
        if (força < 4) {
            System.out.println("Sinto muito va para as cebolas"); 
        }
        
    }
    public void começarCozinhando(){
        if ( nivelHabilidade < 7) {
            System.out.println("Voce pode começar cortando a cebola");
        }
        else{
            System.out.println(" Que incrivel!! voce e habilidoso, entao pode fazer um Soufflé. Boa sorte");
        }  
}

    
    }
