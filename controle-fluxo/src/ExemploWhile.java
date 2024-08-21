
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {

    public static void main(String[] args) {
        double mesada = 50.0;
        System.out.println("Valor da mesada: "+mesada);
        int item = 1;
        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }

            System.out.println(item + " - Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
            System.out.println("Valor que resta da mesada: "+mesada);
            item ++;
        }
        System.out.println("Joãozinho gastou toda a sua mesada em doces");

        /*
        * Não se preocupe quanto a formatação de valores
        * Iremos explorar os recursos de formatação em breve !!
         */
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }

}
