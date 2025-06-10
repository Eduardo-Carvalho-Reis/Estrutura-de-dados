package FilaDinamica;

public interface Enfileiravel <T> {

    void enfileirarInicio(T dado);
    void enfilerarFim(T dado);
    T desenfilerarInicio();
    T desenfileirarFim();
    void atualizarfim(T dado);
    void atulizarinicio(T dado);
    T frente();
    T tras();
    T espiar();

    Boolean estaCheio();
    Boolean estaVazio();
    String imprimirDeFrentePraTras();
    String imprimirDeTrasPraFrente();
}
