
import java.util.stream.IntStream;


public class ExemploForArray {

    public static void main(String[] args) {
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }

        //Forma abreviada  ForEach
        for (String aluno : alunos) {
            System.out.println("O nome do aluno é: " + aluno);
        }

        // Outra forma
        IntStream.range(0, alunos.length)
            .forEach(i -> System.err.println("Índice: " + i + ", Nome: " + alunos[i]));
    }
}
