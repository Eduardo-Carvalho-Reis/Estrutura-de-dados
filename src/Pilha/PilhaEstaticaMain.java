package Pilha;

public class PilhaEstaticaMain {
    public static void main(String[] args) {
        PilhaEstatica Pilha=new PilhaEstatica(5);
        Pilha.empilhar("eu");
        Pilha.empilhar("te amo");
        Pilha.empilhar("yanna minha");
        Pilha.empilhar("gata");
        System.out.println(Pilha.imprimir());
        Pilha.desempilhar();
        Pilha.empilhar("gostosa");
        System.out.println(Pilha.imprimir());


    }
}
