package FilaCircular;

public interface Enfileiravel {
    void enfilerar(Object dado);
    Object desfilerar();
    void atualizarfim(Object dado);
    void atualizarinicio(Object dado);
    Object frente();

    Boolean estaCheio();
    Boolean estaVazio();
    String imprimir();
}
