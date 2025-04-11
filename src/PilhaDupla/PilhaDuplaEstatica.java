package PilhaDupla;

public class PilhaDuplaEstatica implements EmpilhavelDuplo {
    private int ponteiroTopo1,ponteiroTopo2;
    private Object[]dados;

    public PilhaDuplaEstatica(int tamanho){
        ponteiroTopo1=-1;
        ponteiroTopo2=tamanho;
        dados=new Object[tamanho];
    }

    public PilhaDuplaEstatica() {
        this(10);
    }


    @Override
    public void empilhar1(Object dado) {
        if(!estaCheio1()){
            ponteiroTopo1++;
            dados[ponteiroTopo1]=dado;
        }else{
            System.err.println("Pilha Cheia");
        }

    }

    @Override
    public Object desempilhar1() {
        Object aux=null;
        if (!estaVazio1()){
            aux=dados[ponteiroTopo1];
            ponteiroTopo1--;
        }else {
            System.err.println("pilha Vazia");
        }
        return aux;
    }

    @Override
    public Object espiar1() {
        Object aux=null;
        if(!estaVazio1()){
            aux=dados[ponteiroTopo1];
        }else {
            System.err.println("Pilha vazia");
        }
        return aux;
    }

    @Override
    public void atualizar1(Object dado) {

    }

    @Override
    public boolean estaCheio1() {
        return (ponteiroTopo1==ponteiroTopo2-1);
    }

    @Override
    public boolean estaVazio1() {
        return (ponteiroTopo1==-1);
    }

    @Override
    public String imprimir1() {
        String resposta="[";
        for(int i =ponteiroTopo1; i>=0; i--){
            if (ponteiroTopo1==0){
                resposta+=dados[i];
            }else {
                resposta+=dados[i]+",";
            }
        }
        return resposta+"]";
    }

    @Override
    public void empilhar2(Object dado) {
        if(!estaCheio2()){
            ponteiroTopo2--;
            dados[ponteiroTopo2]=dado;
        }else {
            System.err.println("pilha esta cheia");
        }


    }

    @Override
    public Object desempilhar2() {
        Object aux=null;
        if(!estaVazio2()){
            aux=dados[ponteiroTopo2];
            ponteiroTopo2++;
        }else {
            System.err.println("pilha esta vazia");
        }
        return aux;

    }

    @Override
    public void atualizar2(Object dado) {
        if(!estaVazio2()){
            dados[ponteiroTopo2]=dado;
        }

    }

    @Override
    public Object espiar2() {
        Object aux =null;
        if(!estaVazio2()){
            aux=dados[ponteiroTopo2];
        }else {
            System.err.println("pilha esta vazia");
        }
        return aux;
    }

    @Override
    public boolean estaCheio2() {
        return estaCheio1();
    }

    @Override
    public boolean estaVazio2() {
        return(ponteiroTopo2==dados.length);
    }

    @Override
    public String imprimir2() {
        String resultado="[";
        for (int i=ponteiroTopo2; i<= dados.length-1; i++){
            if(i== dados.length-1){
                resultado+=dados[i];
            }else {
                resultado+=dados[i]+ ",";
            }
        }
        return resultado+ "]";

    }
}
