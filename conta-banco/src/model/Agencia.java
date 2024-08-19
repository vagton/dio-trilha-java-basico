package model;

public class Agencia {
    private String numero;

    public Agencia(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    @Override
    public String toString() {
        return "Agencia{numero='" + numero + "'}";
    }
}