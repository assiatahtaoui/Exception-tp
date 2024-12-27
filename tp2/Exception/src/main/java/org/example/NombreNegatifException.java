package org.example;

public class NombreNegatifException extends Exception{
    private int valeurERR;

    public NombreNegatifException(int valeurERR) {
        super("valeur negative detecte: "+ valeurERR);
        this.valeurERR = valeurERR;
    }

    public int getValeurERR() {
        return valeurERR;
    }
}
