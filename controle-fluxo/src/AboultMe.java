
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboultMe {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        try {
            //criando o objeto scanner
            //Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            Scanner scanner = new Scanner(System.in).useLocale(Locale.forLanguageTag("en-US")); // se for Brasileiro colocar pt-BR

            System.out.println("Digite seu nome");
            String nome = scanner.nextLine();
            if (nome.trim().isEmpty()) {
                throw new IllegalArgumentException("O campo nome não pode estar vazio.");
            }

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.nextLine();
            if (sobrenome.trim().isEmpty()) {
                throw new IllegalArgumentException("O campo sobrenome não pode estar vazio.");
            }

            System.out.println("Digite sua idade");
            String idadeInput = scanner.nextLine();
            if (idadeInput.trim().isEmpty()) {
                throw new IllegalArgumentException("O campo idade não pode estar vazio.");
            }
            int idade = Integer.parseInt(idadeInput);

            System.out.println("Digite sua altura");
            String alturaInput = scanner.nextLine();
            if (alturaInput.trim().isEmpty()) {
                throw new IllegalArgumentException("O campo altura não pode estar vazio.");
            }
            double altura = Double.parseDouble(alturaInput);

            // Imprimindo os dados obtidos pelo usuário
            System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + " cm ");

            scanner.close();
        } catch (InputMismatchException e) {
            System.err.println("Os campos idade e altura precisam ser numéricos");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }    
    }
}
