package Fila;

public interface Enfileiravel {
    void enfilerar(Object dado);
    Object desfilerar();
    void atualizarfim(Object dado);
    void atulizarinicio(Object dado);
    Object espiar();

    Boolean estaCheio();
    Boolean estaVazio();
    String imprimir();
}
