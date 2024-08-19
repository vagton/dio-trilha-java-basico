package model;


public class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // podem ter mais atributos e métodos do cliente, mas o projeto inicial ainda não solicitou
    @Override
    public String toString() {
        return "Cliente{nome='" + nome + "'}";
    }
}
