

public class App {
    public static void main(String[] args) {
        GATO gato = new GATO("Whiskers", 3);
        CACHORRO cachorro = new CACHORRO("Labrador", 25.5);

        System.out.println("Gato:");
        gato.comer();
        gato.emitirSom();

        System.out.println("\nCachorro:");
        cachorro.comer();
        cachorro.emitirSom();
    }
}