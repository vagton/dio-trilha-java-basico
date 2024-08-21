
import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {

    public static void main(String[] args) {
        try {
            Number valor = 0;
            // 1 teste de exceção: Isso lançará uma NumberFormatException
            // valor = Double.valueOf("a1.75");

            // 2 teste de exceção: Isso lançará uma ParseException
            valor = NumberFormat.getInstance().parse("a1.75");

            System.out.println(valor);
        } catch (NumberFormatException e) {
            System.out.println("Erro de formato de número: " + e.getMessage());
        } catch (ParseException e) {
            System.out.println("Erro ao fazer parsing do valor: " + e.getMessage());
        }

    }
}
