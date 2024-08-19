
public class ResultadoEscolar {

    public static void main(String[] args) {
        int nota = 5;
        System.out.println("Para a nota:" + nota);

        // Condicionais simples e encadeadas
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        // Condição ternária - Cenário 1
        nota = 7;
        System.out.println("Para a nota:" + nota);
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        // Condição ternária - Cenário 2
        nota = 6;
        System.out.println("Para a nota:" + nota);
        resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);

    }

}
