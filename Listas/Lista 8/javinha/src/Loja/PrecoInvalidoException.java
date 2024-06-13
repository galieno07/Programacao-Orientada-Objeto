package Loja;

public class PrecoInvalidoException extends Exception{
 public PrecoInvalidoException(){
    super("Preco dese ser maior ou igual a 0");
 }
}
