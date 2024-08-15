package service;
import model.Cliente;  

public class ServicoCliente {

    
    public void gravarCliente(Cliente cliente) {
        // Aqui você poderia gravar as informações do cliente em um banco de dados, por exemplo.
        System.out.println("Gravando cliente: " + cliente);
    }

    public void gravar(Cliente cliente) {
        // Este método poderia ser uma sobrecarga, ou fazer algo diferente.
        System.out.println("Cliente gravado com sucesso: " + cliente);
    }

    public static void main(String[] args) {
        // Criando um novo cliente
        Cliente cliente = new Cliente("João", "123.456.789-00", 99887766);

        // Gravando o cliente usando os métodos
        ServicoCliente servico = new ServicoCliente();
        servico.gravarCliente(cliente);
        servico.gravar(cliente);
    }


}