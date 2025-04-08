package Pilha;

public interface Empilhavel{
    // metodos principais
    void empilhar(Object dado);
    Object desempilhar();
    Object espiar();
    void atualizar(Object dado);

    //metodos auxiliares
    boolean estaCheia();
    boolean estaVazia();
    String imprimir();

}
