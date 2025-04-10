package PilhaInvertida;

public class PilhaEstaticaInvertida implements Empilhavel{
    private int ponteiroTopo;
    private Object[]dados;

   public PilhaEstaticaInvertida(int tamanho){
       ponteiroTopo=tamanho;
       dados=new Object[tamanho];

   }
   public PilhaEstaticaInvertida(){
       this(10);
   }


    @Override
    public void empilhar(Object dado) {
       if(!estacheio()){
           ponteiroTopo--;
           dados[ponteiroTopo]=dado;
       }else {
           System.err.println("pilha esta cheia");
       }


    }

    @Override
    public Object desepilhar() {
       Object aux=null;
       if(!estavazio()){
           aux=dados[ponteiroTopo];
           ponteiroTopo++;
       }else {
           System.err.println("pilha esta vazia");
       }
       return aux;

    }

    @Override
    public void atualizar(Object dado) {
       if(!estavazio()){
           dados[ponteiroTopo]=dado;
       }

    }

    @Override
    public Object espiar() {
        Object aux =null;
        if(!estavazio()){
            aux=dados[ponteiroTopo];
        }else {
            System.err.println("pilha esta vazia");
        }
        return aux;
    }

    @Override
    public boolean estacheio() {
        return (ponteiroTopo==0);
    }

    @Override
    public boolean estavazio() {
        return(ponteiroTopo==dados.length);
    }

    @Override
    public String imprimir() {
        String resultado="[";
        for (int i=ponteiroTopo; i<= dados.length-1; i++){
            if(i== dados.length-1){
                resultado+=dados[i];
            }else {
                resultado+=dados[i]+ ",";
            }
        }
        return resultado+ "]";

    }
}
