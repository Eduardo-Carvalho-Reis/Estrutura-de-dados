package Fila;

public class FilaEstaticaPrincipal {
    public static void main(String[] args) {
        Enfileiravel fila = new FilaEstatica();
        fila.enfilerar("A");
        System.out.println(fila.espiar());
        fila.enfilerar("B");
        fila.enfilerar("C");
        fila.enfilerar("D");
        fila.desfilerar();
        fila.enfilerar("E");
        Object conteudo = fila.desfilerar();
        fila.enfilerar("F");
        System.out.println(fila.espiar());
        System.out.println(fila.espiar());
        fila.enfilerar("G");
        fila.enfilerar(conteudo);
        fila.enfilerar("I");
        fila.enfilerar("J");
        fila.enfilerar("K");
        System.out.println("Fila: " + fila.imprimir());
    }
}