package PilhaInvertida;

public interface Empilhavel {
    //metodos principais
    void empilhar(Object dado);
    Object desepilhar();
    void atualizar(Object dado);
    Object espiar();

    //metodos auxiliares
    boolean estacheio();
    boolean estavazio();
    String imprimir();
}
