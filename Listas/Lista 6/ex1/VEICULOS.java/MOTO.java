package VEICULOS;

public class MOTO implements VEICULO {
    private String modelo;
    private int cilindrada;

    public MOTO(String modelo, int cilindrada) {
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void acelerar() {
        System.out.println("Vruuum Vruuum!");
    }

    
    public void frear() {
        System.out.println("Eeeeeeeep!");
    }
}