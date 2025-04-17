package FilaCircular;

public class FilaCircularEstatica implements Enfileiravel{
    private int ponteiroFim;
    private int ponteiroInicio;
    private int quantidade;
    private Object []dados;

    public FilaCircularEstatica(int tamanho) {
            ponteiroFim = -1;
            ponteiroInicio = 0;
            quantidade = 0;
            dados= new Object[tamanho];
    }
    public FilaCircularEstatica(){this(10);}

    @Override
    public void enfilerar(Object dado) {
        if (!estaCheio()) {
            ponteiroFim = avancar(ponteiroFim);
            dados[ponteiroFim] = dado;
            if (estaVazio())
                ponteiroInicio = ponteiroFim;

            quantidade++;
        } else {
            System.err.println("fila cheia");
        }
    }

    @Override
    public Object desfilerar() {
        Object inicio=null;
        if(!estaVazio()){
            inicio=dados[ponteiroInicio];
            ponteiroInicio=avancar(ponteiroInicio);
            quantidade--;

        }else {
            System.out.println("fila vazia");
        }
        return inicio;
    }

    @Override
    public void atualizarfim(Object dado) {
        if (!estaVazio()) {
            dados[ponteiroFim] = dado;
        }else {
            System.err.println("fila vazia");
        }
    }

    @Override
    public void atualizarinicio(Object dado) {
        if(!estaVazio()){
            dados[ponteiroInicio]=dado;
        }else {
            System.err.println("fila vazia");
        }

    }

    @Override
    public Object frente() {
        Object dadoInicial=null;
        if (!estaVazio()){
            dadoInicial=dados[ponteiroInicio];
        }else {
            System.err.println("fila vazia");
        }
        return dadoInicial;
    }

    @Override
    public Boolean estaCheio() {
        return (quantidade==dados.length);
    }

    @Override
    public Boolean estaVazio() {
        return(quantidade==0);
    }

    @Override
    public String imprimir() {
        String retorno="[";
        int ponteiroAux=ponteiroInicio;
        for(int i =0;i<quantidade;i++){
            if(i==quantidade-1){
                retorno+=dados[ponteiroAux];
            }else{
                retorno+=dados[ponteiroAux]+",";
            }
            ponteiroAux=avancar(ponteiroAux);
        }
        return retorno+"]";
    }
    private int avancar(int ponteiro){
        return (ponteiro+1)%dados.length;

    }
}
