package es.upm.grise;

public class EntradaInvalida extends Exception{
    public EntradaInvalida(int n){
        super(String.format("El valor '%d' no es válido", n));
    }
}
