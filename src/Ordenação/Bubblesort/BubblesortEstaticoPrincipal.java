package Ordenação.Bubblesort;

import java.util.Random;

public class BubblesortEstaticoPrincipal {
    private Integer dados[]= new Integer[200];
    public static void main(String[] args) {
        BubblesortEstaticoPrincipal principal = new BubblesortEstaticoPrincipal();

        principal.preencherDadosAleatorios();

        Ordenavel sort=new BubblesortEstatico(principal.dados);
        System.out.println(principal.imprimir());
        long tempoInicioMili=System.currentTimeMillis();
        long tempoInicioNano=System.nanoTime();

        sort.ordenar();

        long tempoFimNano = System.nanoTime();
        long tempoFimMili = System.currentTimeMillis();
        System.out.println(principal.imprimir());
        System.out.println("Tempo em ms:" + (tempoFimMili - tempoInicioMili));
        System.out.println("Tempo em ns:" + (tempoFimNano - tempoInicioNano));


    }
    public void preencherDadosAleatorios(){
        Random gerador= new Random();

        for (int i=0; i<dados.length;i++){
            dados[i]=gerador.nextInt(dados.length*2);
        }
    }
    public String imprimir(){
            String resultado="";
            for(int i=0;i<dados.length;i++){
                resultado+=dados[i];
                if (i!=dados.length-1){
                    resultado+=",";
                }
            }
            return "{" + resultado + "}";
    }
}
