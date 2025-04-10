package PilhaInvertida;

public class PilhaEstaticaInvertidaPrincipal {
    public static void main(String[] args) {
        PilhaEstaticaInvertida Pilha=new PilhaEstaticaInvertida(5);
        Pilha.empilhar("eu");
        Pilha.empilhar("te amo");
        Pilha.empilhar("yanna minha");
        Pilha.empilhar("gata");
        System.out.println(Pilha.imprimir());
        Pilha.desepilhar();
        Pilha.empilhar("gostosa");
        System.out.println(Pilha.imprimir());


    }
}
