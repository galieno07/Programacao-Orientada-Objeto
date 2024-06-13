package Loja;

public class NomeInvalidoExcepticon extends Exception{

    public NomeInvalidoExcepticon(){
        super("Nome eh obrigatorio");
    }

}
