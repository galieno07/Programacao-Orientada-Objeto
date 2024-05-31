package ANIMAIS;

public class CACHORRO implements ANIMAL {
    private String raca;
    private double peso;

    public CACHORRO(String raca, double peso) {
        this.raca = raca;
        this.peso = peso;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public void comer() {
        System.out.println("O cachorro da raça " + raca + " está comendo carne.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro da raça " + raca + " faz: Au au!");
    }
}
