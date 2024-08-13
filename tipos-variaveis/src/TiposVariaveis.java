import java.util.Arrays;
import java.util.stream.Collectors;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // Tipos primitivos: int, byte, short, long, float, double, boolean e char
        // Data Type	Size	Default	Range
        // byte	        1 byte	0	    -128 to 127
        // short	    2 byte	0	    -215 to 215-1
        // int	        4 byte	0	    -231 to 231-1
        // long	        8 byte	0	    -263 to 263-1
        // float	    4 byte	0.0f	N/A
        // double	    8 byte	0.0d	N/A
        // char	        2 byte	\u0000	0 to 65535
        // boolean	    N/A	    false	true / false
        double salarioMinimo = 2500;
        byte idade = 23;
        short ano = 2024;
        int cep = 21820010; // se começar com zero pode ter que colocal como String
        long cpf = 87721711037L; // se começar com zero, talvez tenha que colocar com outro tipo
        float pi = 3.14F;
        double salario = 1275.33;
        // java é fortemente "tipado"
        short numeroCurto =1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 =  (short) numeroNormal; // aplicando cast
        int numero = 5;
        numero = 10;
        System.out.println(numero);
        final double VALOR_DE_PI = 3.14;
        // VALOR_DE_PI = 3.1415; // dá erro por que VALOR_DE_PI é uma constante
        // Armazenamento:
        //  Tipos primitivos: São armazenados diretamente na memória stack.
        //  String: Referencia um objeto que é armazenado na memória heap.
        // Imutabilidade:
        //  Tipos primitivos: Seus valores podem ser alterados diretamente.
        //  String: É imutável, o que significa que, uma vez criada, seu valor não pode ser alterado. Qualquer operação que modifique uma String retorna uma nova String.
        String meuNome = "Wagner Dos Santos";
        System.out.println(meuNome);
        meuNome = meuNome.toUpperCase();
        System.out.println(meuNome);
        meuNome = meuNome.toLowerCase();
        System.out.println(meuNome);
        // como não existe uma maneira nativa de voltar com o nomee em meuNome como era antes, uma forma seria:
        meuNome= capitalizeWords(meuNome);
        System.out.println(meuNome);

        String firstName = "John";
        String lastName = "Doe";
        String name = firstName+ " " + lastName;
        System.out.println(name);

        int num = 5;
        float floatNum = 5.99f;
        char letter = 'D';
        boolean bool = true;

        //Arrays
        char[] chars = new char[10];
        chars[0] = 'a';
        chars[1] = 'b';

        String[] letters = {"A", "B", "C"};
        int[] mylist = {100, 200};
        boolean[] answers = {true, false};

        
    }

    public static String capitalizeWords(String str) {
        return Arrays.stream(str.split(" "))
                .map(palavra -> palavra.substring(0, 1).toUpperCase() + palavra.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
    }
}
