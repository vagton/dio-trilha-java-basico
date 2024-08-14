
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Date;


public class Operadores {

    public static void main(String[] args) throws Exception {
        System.out.println("Operadores");
        Date dataNascimento = new Date();
        // verifica que a que classe pertence

        // Define a codificação padrão do sistema para UTF-8
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8), true);

        writer.println("O tipo de 'obj' é: " + dataNascimento.getClass().getName());

        String s = 3 + "str" + 3;     // 3str3
        s = 3 + 3 + "str";     // 6str
        s = "3" + 3 + "str";   // 33str
        s = "3" + "3" + "23";  // 3323
        s = "" + 3 + 3 + "23"; // 3323
        //s = 3 + 3 + 23;        // Incompatible types
        int num = 1;
        num = num + 1; // 2
        num++; // 3
        System.out.println(num);
        num--; // 2
        System.out.println(num);
        boolean v1 = true;
        v1 = !v1;
        System.out.println(v1);

        String s1 = new String("ABC");
        String s2 = new String("ABC");

        System.out.println(s1 == s2);          // false
        System.out.println(s1.equals(s2));     // true

        System.out.println("ABC".equalsIgnoreCase("abc"));  // true
        String str = "Abcd";

        str = str.toUpperCase();     // ABCD
        str = str.toLowerCase();     // abcd
        str = str.concat("#");       // Abcd#
        str = str.replace("b", "-"); // A-cd

        str = "  abc ".trim();       // abc
        char str2 [] = "ab".toCharArray();    // {'a', 'b'}
        // Passo 3: Converter o array de caracteres em JSON

        String resultado = formatCharArrayToJSON(str2);
        System.out.println(resultado);

        int a = 5;
        int b = 6;
        String resposta = "";

        // Operador relacional
        if (a == b) {
            resposta = "Verdadeiro";
        }else{
            resposta = "Falso";
        }

        System.out.println(resposta);

        // Operador ternário

        resposta = "";
        resposta = a == b ? "Verdadeiro" : "Falso";
        System.out.println(resposta);

        // operadores logicos
        // &&, ||
        Boolean b1 = true;
        Boolean b2 = false;
        if (b1 && b2) {
            writer.println("As duas condições são verdadeiras");
        } else {
            writer.println("As duas condições não são verdadeiras");
        }


    }

    public static String formatCharArrayToJSON(char[] array) {
        StringBuilder sb = new StringBuilder("{");

        for (int i = 0; i < array.length; i++) {
            sb.append("'").append(Character.toUpperCase(array[i])).append("'");
            if (i < array.length - 1) {
                sb.append(",");
            }
        }

        sb.append("}");
        return sb.toString();
    }
}
