package ABPGenerica;

public class ABP<T extends Comparable<T>> implements Arborizavel<T>{

    private NoTriplo<T>raiz;

    public ABP(){
        raiz=null;

    }
    @Override
    public NoTriplo<T> getRaiz() {
        return raiz;
    }

    @Override
    public void inserir(T dado) {
        NoTriplo<T> novoNodo=new NoTriplo<>();
        novoNodo.setDado(dado);
        if(raiz==null){
            raiz=novoNodo;
        }else {
            NoTriplo<T>auxiliar=raiz;
            while (true){
                int comparacao=dado.compareTo(auxiliar.getDado());
                if(comparacao<=0){
                    if(auxiliar.getFilhoEsquerdo()==null){
                        auxiliar.setFilhoEsquerdo(novoNodo);
                        novoNodo.setGenitor(auxiliar);
                        break;
                    }
                    auxiliar=auxiliar.getFilhoEsquerdo();
                }else {
                    if(auxiliar.getFilhoDireito()==null){
                        auxiliar.setFilhoDireito(novoNodo);
                        novoNodo.setGenitor(auxiliar);
                        break;
                    }
                    auxiliar=auxiliar.getFilhoDireito();
                }
            }
        }
    }

    @Override
    public T apagar(T dado) {
        NoTriplo<T>aux=buscar(dado);
        if(aux==null){
            return null;
        }
        if(aux.getFilhoDireito()==null&&aux.getFilhoEsquerdo()==null){
            apagarNoFolha(aux);
        }
        else if (aux.getFilhoDireito()==null || aux.getFilhoEsquerdo()==null){
            apagarComUmFilho(aux);
        }else {
            apagarComDoisFilhos(aux);
        }
        return dado;
    }
    private void apagarNoFolha(NoTriplo<T> nodo){
        NoTriplo<T> pai=nodo.getGenitor();
        if(pai==null){
            raiz=null;
        }else {
            if (nodo.equals(pai.getFilhoEsquerdo()))
                //nodo é filho da esquerda
                pai.setFilhoEsquerdo(null);
            else
                //nodo é filho da direita
                pai.setFilhoDireito(null);
        }
    }
    private void apagarComUmFilho(NoTriplo<T> nodo){
    NoTriplo<T>avo=nodo.getGenitor();
    NoTriplo<T>neto=(nodo.getFilhoEsquerdo()!=null)?nodo.getFilhoEsquerdo():nodo.getFilhoDireito();
    if(avo==null){
        raiz=neto;
        raiz.setGenitor(null);

    }else {
        neto.setGenitor(avo);
        if (nodo.equals(avo.getFilhoEsquerdo())) {
            avo.setFilhoDireito(neto);
        } else {
            avo.setFilhoDireito(neto);
        }
    }


    }
    private void apagarComDoisFilhos(NoTriplo<T> nodo){
        NoTriplo<T>sucessor=encontrarMenorDireita(nodo);

        nodo.setDado(sucessor.getDado());

        if(sucessor.getFilhoEsquerdo()==null&&sucessor.getFilhoDireito()==null){
            apagarNoFolha(sucessor);
        }else {
            apagarComUmFilho(sucessor);
        }


    }

    private NoTriplo<T> encontrarMenorDireita(NoTriplo<T> nodo){
        NoTriplo<T>Aux=nodo.getFilhoDireito();
        while (Aux.getFilhoEsquerdo()!=null){
            Aux=Aux.getFilhoEsquerdo();
        }
        return Aux;
    }
    private NoTriplo<T>encontrarMaiorEsquerda(NoTriplo<T> nodo){
        NoTriplo<T>aux=nodo.getFilhoEsquerdo();
        while (aux.getFilhoDireito()!=null){
            aux=aux.getFilhoDireito();
        }
        return aux;
    }


    @Override
    public boolean existe(T dado) {
        return buscar(dado)!=null;
    }
    private NoTriplo<T> buscar(T dado) {
        NoTriplo<T>noAuxiliar=raiz;
        while (noAuxiliar!=null){
            int comparacao=dado.compareTo(noAuxiliar.getDado());
            if(comparacao==0){
                return noAuxiliar;
            }
            noAuxiliar=((comparacao<0)?noAuxiliar.getFilhoEsquerdo():noAuxiliar.getFilhoDireito());
        }
        return null;
    }

    @Override
    public void limpar() {
        raiz=null;

    }

    @Override
    public String imprimirPreOrdem() {
        return formataSaida(imprimirPreOrdemRec(raiz));
    }

    /**
     * Retorna uma String com os elementos em ordem.
     * @return Elementos em ordem.
     */
    @Override
    public String imprimirEmOrdem() {
        return formataSaida(imprimirEmOrdemRec(raiz));
    }

    /**
     * Retorna uma String com os elementos em pós-ordem.
     * @return Elementos em pós-ordem.
     */
    @Override
    public String imprimirPosOrdem() {
        return formataSaida(imprimirPosOrdemRec(raiz));
    }

    private String imprimirPreOrdemRec(NoTriplo<T> raizAtual) {
        if (raizAtual == null) return "";   //caso base
        return raizAtual.getDado() + " " +
                imprimirPreOrdemRec(raizAtual.getFilhoEsquerdo()) +  " " +
                imprimirPreOrdemRec(raizAtual.getFilhoDireito());
    }

    private String imprimirEmOrdemRec(NoTriplo<T> raizAtual) {
        if (raizAtual == null) return "";   //caso base
        return imprimirEmOrdemRec(raizAtual.getFilhoEsquerdo()) + " " +
                raizAtual.getDado() + " " +
                imprimirEmOrdemRec(raizAtual.getFilhoDireito());
    }

    private String imprimirPosOrdemRec(NoTriplo<T> raizAtual) {
        if (raizAtual == null) return "";   //caso base
        return imprimirPosOrdemRec(raizAtual.getFilhoEsquerdo()) + " " +
                imprimirPosOrdemRec(raizAtual.getFilhoDireito()) +  " " +
                raizAtual.getDado();
    }

    private String formataSaida(String msg) {
        String resultado;
        do {
            resultado = msg;
            msg = msg.replace("  ", " "); //remove excesso de espaços
        } while (!msg.equals(resultado));
        msg = msg.trim(); //remove espaços em branco do inicio e fim, se existir
        msg = msg.replace(" ", ","); //troca espaço por vírgula
        return "[" + msg + "]";
    }
}
