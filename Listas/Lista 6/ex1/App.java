package VEICULOS;

public class App {
    public static void main(String[] args) throws Exception {
        CARRO carro = new CARRO("Toyota", 2020);
        MOTO moto = new MOTO("Harley-Davidson", 883);

        System.out.println("Carro:");
        carro.acelerar();
        carro.frear();

        System.out.println("\nMoto:");
        moto.acelerar();
        moto.frear();
    }
    
}
