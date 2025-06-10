package FilaDinamica;

import java.util.NoSuchElementException;

public class FilaDinamicaGenerica<T> implements Enfileiravel<T> {
    private NodoDuplo<T>ponteiroInicio;
    private NodoDuplo<T>ponteiroFim;
    private int quantidade;
    private int tamanho;

    public FilaDinamicaGenerica(){
        this(10);
    }
    public FilaDinamicaGenerica(int tamanho){
        ponteiroFim=null;
        ponteiroInicio=null;
        quantidade=0;
        this.tamanho=tamanho;
    }

    @Override
    public void enfileirarInicio(T dado) {
        throw new UnsupportedOperationException("Operação não suportada!");
    }

    @Override
    public T desenfileirarFim() {
        throw new UnsupportedOperationException("Operação não suportada!");
    }

    @Override
    public T tras() {
        throw new UnsupportedOperationException("Operação não suportada!");
    }

    @Override
    public String imprimirDeTrasPraFrente() {
        throw new UnsupportedOperationException("Operação não suportada!");
    }

    @Override
    public void enfilerarFim(T dado) {
        if(estaCheio()){
            throw new NoSuchElementException("fila vazia22");
        }
        NodoDuplo<T> novoNodo=new NodoDuplo<>(dado);
        novoNodo.setAnterior(ponteiroFim);
        if(!estaVazio())
            ponteiroFim.setProximo(novoNodo);
        else
            ponteiroInicio=novoNodo;
        novoNodo.setProximo(novoNodo);
        ponteiroFim=novoNodo;
        quantidade++;


    }

    /**
     * Metodo que Desenfileira,e retorna
     * o dado do ponteiroInicio
     * @throws NoSuchElementException
     */

    @Override
    public T desenfilerarInicio() {
        T dadoInicio;
        if(estaVazio()){
            throw new NoSuchElementException("Fila vazia");
        }
        dadoInicio=ponteiroInicio.getDado();
        ponteiroInicio=ponteiroInicio.getProximo();
        quantidade--;
        if(!estaVazio()){
            ponteiroInicio.setAnterior(null);
        }
        return dadoInicio;
    }
    /**
     * Atualiza, o elemento do Fim da fila
     * @param dado , é o novo dado que Substituira o que esta
     * no Fim da fala
     * @throws NoSuchElementException
     */

    @Override
    public void atualizarfim(T dado) {
        if(estaVazio()){
            throw new NoSuchElementException("fila vazia");
        }
        ponteiroFim.setDado(dado);

    }

    /**
     * Atualiza, o elemento do Inicio da fila
     * @param dado , é o novo dado que Substituira o que esta
     * no inicio da fala
     * @throws NoSuchElementException
     */

    @Override
    public void atulizarinicio(T dado) {
        if(estaVazio()){
            throw new NoSuchElementException("fila vazia");
        }
        ponteiroInicio.setDado(dado);

    }

    @Override
    public T frente() {
        if(estaVazio()){
            throw new NoSuchElementException("Fila vazia");
        }
        return ponteiroFim.getDado();
    }


    @Override
    public T espiar() {
        return null;
    }

    @Override
    public Boolean estaCheio() {
        return (quantidade==tamanho);
    }

    @Override
    public Boolean estaVazio() {
        return (quantidade==0);
    }

    @Override
    public String imprimirDeFrentePraTras() {
        String retorno="[";
        NodoDuplo<T> aux=ponteiroInicio;
        for (int i=0;i<quantidade;i++){
            retorno+=aux.getDado();
            if(i!=quantidade-1)
                retorno+=",";
            aux=aux.getProximo();
        }
        return retorno+"]";
    }


}
