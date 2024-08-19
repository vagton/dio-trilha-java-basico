
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;
import model.Agencia;
import model.Cliente;
import model.Conta;

/* <h1>Projeto Conta Banco</h1>
* Recebe dados via terminal contendo as características de conta em banco
* Permite que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada
* Depois de todas as informações terem sido inseridas, o sistema exibirá uma mensagem correspondente aos dados fornecidos.
* A Classe Scanner é utilizada para entrada de dados
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  Vagton A F
* @version 1.0
* @since   19/08/2024
 */
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Conta Banco");
        // TODO: Conhecer e Importar a Classe Scanner

        // Exibr as mensagens para o nosso usuário
        // Obter pelo scanner os valores digitados no terminal
        // Exibir a mensagen "Conta criada!"
        // Criando uma instância do Scanner para capturar as entradas do usuário
        //O Locale esteja configurado corretamente para aceitar o formato decimal que você está utilizando. 
        // No Brasil, por exemplo, o formato decimal com "," (vírgula), enquanto em muitos outros locais é . (ponto).
        // Por isso como no projeto manda colocar "." então usarei um tratamento para isso.
        Scanner scanner = new Scanner(System.in).useLocale(Locale.forLanguageTag("pt-BR"));

        String nomeCliente = "";
        String numeroAgencia = "";
        int numeroConta = 0;
        double saldo = 0.0;

        try {
            // Coletando os dados do cliente
            System.out.println("Entrada de Dados de:");
            System.out.println("Por favor, digite o seu nome:");
            nomeCliente = scanner.nextLine(); // Usando nextLine() para capturar o nome completo
            if (nomeCliente.trim().isEmpty()) {
                throw new IllegalArgumentException("Nome não pode ser vazio.");
            }

            System.out.println("Por favor, digite o número da Agência:");
            numeroAgencia = scanner.nextLine(); // Usando nextLine() para ler a entrada da agência
            if (numeroAgencia.trim().isEmpty()) {
                throw new IllegalArgumentException("Número da agência não pode ser vazio.");
            }

            System.out.println("Por favor, digite o número da Conta:");
            try {
                numeroConta = scanner.nextInt(); // Ler um número inteiro
            } catch (InputMismatchException e) {
                scanner.next(); // Limpar o buffer
                throw new IllegalArgumentException("Número da conta deve ser um número inteiro.");
            }

            // Limpar o buffer do scanner
            scanner.nextLine();

            System.out.println("Por favor, digite o saldo inicial:");
            String saldoStr = scanner.nextLine(); // Ler o saldo como String

            // Substituir a vírgula por ponto se necessário
            saldoStr = saldoStr.replace(',', '.');

            try {
                saldo = Double.parseDouble(saldoStr); // Converter a String para double
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Saldo deve ser um número decimal.");
            }

            // Criando os objetos de modelo
            Cliente cliente = new Cliente(nomeCliente);
            Agencia agencia = new Agencia(numeroAgencia);
            Conta conta = new Conta(numeroConta, agencia, cliente, saldo);

            // Imprimindo os objetos para mostrar que estão criados lá, para posteriormente serem persistidos ou trabalhados
            System.out.println("\nObjetos que foram criados:");
            System.out.println(cliente);
            System.out.println(agencia);
            System.out.println(conta+"\n");

            System.out.println("Mensagen para o Usuário:\n");

            // Exibindo a mensagem final
            String mensagem = "Olá " + conta.getCliente().getNome()
                    .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                    .concat(conta.getAgencia().getNumero())
                    .concat(", conta ")
                    .concat(String.valueOf(conta.getNumero()))
                    .concat(" e seu saldo ")
                    .concat(String.valueOf(conta.getSaldo()))
                    .concat(" já está disponível para saque.");

            System.out.println(mensagem);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (NoSuchElementException e) {
            System.out.println("Entrada inesperada. Por favor, insira todos os dados corretamente.");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }

        scanner.close();

    }
}
