import model.Cliente;
import model.MyClass;
import service.ServicoCliente;


public class Metodos {
    public static void main(String[] args) throws Exception {
        // métodos, parâmetros e visibilidades
        // Criando um novo cliente
        Cliente clienteA = new Cliente("João", "123.456.789-00", 99887766);

        // Criando um novo serviço como ServicoCliente, não Object
        ServicoCliente servicoC = new ServicoCliente();

        // Gravando o cliente e exibindo a saída
        servicoC.gravarCliente(clienteA);
        System.out.println("Cliente gravado com sucesso!");

        MyClass minhaClasse = new MyClass();
        double resposta = minhaClasse.dividir(9, 2);
        System.out.println(resposta);
    }  
}    
