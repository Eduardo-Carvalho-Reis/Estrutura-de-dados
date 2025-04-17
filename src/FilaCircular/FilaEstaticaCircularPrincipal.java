package FilaCircular;

public class FilaEstaticaCircularPrincipal {
    public static void main(String[] args) {
        Enfileiravel fila=new FilaCircularEstatica();
        fila.enfilerar("A");
        System.out.println(fila.frente());
        fila.enfilerar("B");
        fila.enfilerar("C");
        fila.atualizarinicio("H");
        fila.enfilerar("D");
        fila.desfilerar();
        fila.enfilerar("E");
        Object conteudo = fila.desfilerar();
        fila.enfilerar("F");
        fila.atualizarfim("J");
        System.out.println(fila.frente());
        System.out.println(fila.frente());
        fila.enfilerar("G");
        fila.enfilerar(conteudo);
        fila.enfilerar("I");
        fila.atualizarinicio("K");
        fila.enfilerar("J");
        fila.enfilerar("K");
        System.out.println("Fila: " + fila.imprimir());

    }



}
