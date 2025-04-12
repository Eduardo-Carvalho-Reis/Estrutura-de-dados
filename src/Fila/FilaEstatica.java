package Fila;

public class FilaEstatica implements Enfileiravel {
    private int ponteiroInicio,ponteiroFim;
    private Object[]dados;

    public FilaEstatica(int tamanho){
        ponteiroFim=-1;
        ponteiroInicio=0;
        dados=new Object[tamanho];
    }
    public FilaEstatica(){
        this(10);
    }


    @Override
    public void enfilerar(Object dado) {
        if(!estaCheio()){
            ponteiroFim++;
            dados[ponteiroFim]=dado;
        }else {
            System.err.println("fila cheia");
        }
        //-1,f0,i1,2if;
        //0=-1+1=0 true
        //0=0+1=1 false
        //1=0+1=true
        //2=2+1=false
        //3=2+1=true
    }

    @Override
    public Object desfilerar() {
        Object Inicio=null;
        if(!estaVazio()){
            Inicio=dados[ponteiroInicio];
            ponteiroInicio++;

        }else {
            System.err.println("fila vazia");
        }
        return Inicio;
    }

    @Override
    public void atualizarfim(Object dado) {
        if(!estaVazio()){
            dados[ponteiroFim]=dado;
        }else {
            System.err.println("fila vazia");
        }

    }

    @Override
    public void atulizarinicio(Object dado) {
        if(!estaVazio()){
            dados[ponteiroInicio]=dado;
        }else {
            System.err.println("fila vazia");
        }

    }


    @Override
    public Object espiar() {
        Object aux = null;
        if (!estaVazio()) {
            aux = dados[ponteiroInicio];
        } else {
            System.err.println("fila vazia");
        }
        return aux;
    }

    @Override
    public Boolean estaCheio() {
        return (ponteiroFim==dados.length-1);
    }

    @Override
    public Boolean estaVazio() {
        return(ponteiroInicio==ponteiroFim+1);
        //f-1,i0,1,2;
        //0=-1+1=0 vazia
        //-1,fi0,1,2;
        //0=0+1=1 cheia
        //-1,i0,f1,2;
        //0=1+1=2 cheia;
        //-1,0,if1,2
        //1=1+1=2 cheia;
        //-1,0,f1,i2;
        //2=1+1= 2 vazi;

    }

    @Override
    public String imprimir() {
        String resposta="[";
        for(int i=ponteiroInicio;i<=ponteiroFim;i++ ){

            if(i==ponteiroFim){
                resposta+=dados[i];
            }else {
                resposta+=dados[i]+",";
            }
        }
        return resposta+"]";
    }
    public int avanca(int ponteiro){
        return (ponteiro+1)% dados.length;
    }
}
