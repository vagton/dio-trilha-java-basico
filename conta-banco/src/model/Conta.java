package model;

public class Conta {
    private int numero;            // Número da conta Exemplo: 1021             Inteiro
    private Agencia agencia;       // Objeto onde está o nomeAgencia Exemplo: 067-8            Texto
    private Cliente cliente;       // Obejto onde está o nomeCliente Exemplo: MARIO ANDRADE    Texto
    private double saldo;          // Exemplo: 237.48           Decimal

    public Conta(int numero, Agencia agencia, Cliente cliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    // Getters e Setters   

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", agencia=" + agencia +
                ", cliente=" + cliente +
                ", saldo=" + saldo +
                '}';
    }
}

