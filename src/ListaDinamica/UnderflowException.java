package ListaDinamica;

public class UnderflowException extends Exception{
    /**
     * Construtor que cria uma exceção com a mensagem especificada.
     *
     * @param mensagem a mensagem de erro
     */
    public UnderflowException(String mensagem) {
        super(mensagem);
    }
}
