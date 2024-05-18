public class Carro {
 
    String marca;
    int velocidadeMaxima;
    int temCombustivel;

public void modelo(){
    System.out.println(marca);
}
    public void daSaidaNoCarro()
{
    System.out.println("Ligando o carro");
}

public void dirrigirCarro(){
    if (  temCombustivel >= 5) {
        System.out.println("Acelerando !VRUMMMMMMMM");
    }
    else{
        System.out.println("pi pi pi, sem combustivel no automovel =( ");
    }
}

}
