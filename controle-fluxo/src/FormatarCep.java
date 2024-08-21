
public class FormatarCep {

    public static void main(String[] args) {

        try {
            System.out.println(formatarCep("23765064"));
            System.out.println(formatarCep("23765064xyz")); // aqui vai lançar a exceção
        } catch (CepInvalidoException ex) {
            System.out.println("Erro de formato do Cep: " + ex.getMessage());
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }

        //simulando um cep formatado
        //return "23.765-064";
        // Formata o CEP como "23.765-064"
        String cepFormatado = cep.substring(0, 2) + "."
                + cep.substring(2, 5) + "-"
                + cep.substring(5, 8);

        return cepFormatado;
    }
}
