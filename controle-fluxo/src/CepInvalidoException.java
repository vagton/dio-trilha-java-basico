
public class CepInvalidoException extends Exception {

    // Construtor padrão
    public CepInvalidoException() {
        super("O CEP informado é inválido. Ele deve conter 8 dígitos.");
    }

    // Construtor que permite uma mensagem personalizada
    public CepInvalidoException(String message) {
        super(message);
    }
}
