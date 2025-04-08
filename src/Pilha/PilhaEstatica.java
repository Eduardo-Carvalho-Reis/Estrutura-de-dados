package Pilha;

public class PilhaEstatica implements Empilhavel {
    private int ponteiroTopo;
    private Object[] dados;
    private int tamanho;


    //construtor
    public PilhaEstatica(){
       this(10);
    }

    public PilhaEstatica(int tamanho){
        ponteiroTopo=-1;
        dados=new Object[tamanho];

    }

    @Override
    public void empilhar(Object elemento) {
        if(!estaCheia()){
            ponteiroTopo++;
            dados[ponteiroTopo]=elemento;

        }else{
            System.out.println("pilha esta cheia");
        }
    }

    @Override
    public Object desempilhar() {
        Object elementotopo= null;
        if(!estaVazia()){
            elementotopo=dados[ponteiroTopo];
            ponteiroTopo--;

        }else{
            System.out.println("pilha esta vazia");
        }
        return elementotopo;
    }

    @Override
    public Object espiar() {
        Object elementotopo=null;
        if(!estaVazia()){
            elementotopo=dados[ponteiroTopo];

        }else{
            System.out.println("esta vazia");
        }

        return elementotopo;


    }

    @Override
    public void atualizar(Object dado) {

    }

    @Override
    public boolean estaCheia() {
        return (ponteiroTopo== dados.length-1);
    }
    public Object test(){
        return dados.length;
    }

    @Override
    public boolean estaVazia() {
        return (ponteiroTopo==-1);
    }

    @Override
    public String imprimir() {
        String resultado="[";
        for (int i=ponteiroTopo; i>=0; i--){
            if(i==0){
                resultado+=dados[i];
            }else {
                resultado+=dados[i]+ ",";
            }
        }
        return resultado+ "]";

    }

}

