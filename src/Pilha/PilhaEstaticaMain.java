package Pilha;

public class PilhaEstaticaMain {
    public static void main(String[] args) {
        PilhaEstatica Pilha=new PilhaEstatica(5);
        Pilha.empilhar("1");
        Pilha.empilhar("2");
        Pilha.empilhar("3");
        Pilha.empilhar("4");
        System.out.println(Pilha.imprimir());
        Pilha.desempilhar();
        Pilha.empilhar("5");
        System.out.println(Pilha.imprimir());


    }
}
