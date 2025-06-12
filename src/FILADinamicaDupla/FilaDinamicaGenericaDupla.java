package FILADinamicaDupla;

import FilaDinamica.FilaDinamicaGenerica;

import java.util.NoSuchElementException;

public class FilaDinamicaGenericaDupla <T> implements Enfileiravel<T>{
    private NodoDuplo<T> ponteiroFim,ponteiroInicio;
    private int quantidade,tamanho;

    public FilaDinamicaGenericaDupla(int tamanho){
        ponteiroFim=null;
        ponteiroInicio=null;
        quantidade=0;
        this.tamanho=tamanho;

    }




    @Override
    public void enfileirarInicio(T dado) {
        if(estaCheio()){
            throw new NoSuchElementException("fila cheia");
        }
        NodoDuplo<T> novoNodo = new NodoDuplo<>(dado);
        novoNodo.setProximo(ponteiroInicio);
        if (!estaVazio()) {
            ponteiroInicio.setAnterior(novoNodo);
        } else  {
            ponteiroFim = novoNodo;
        }
        ponteiroInicio = novoNodo;
        quantidade++;

    }

    @Override
    public void enfilerarFim(T dado) {
        if(estaCheio()){
            throw new NoSuchElementException("fila cheia");
        }
        NodoDuplo<T> novoNodo= new NodoDuplo<>(dado);
        novoNodo.setAnterior(ponteiroFim);
        if(!estaVazio()) {
            ponteiroFim.setProximo(novoNodo);
        } else {
            ponteiroInicio = novoNodo;
        }
        novoNodo.setProximo(novoNodo);
        ponteiroFim=novoNodo;
        quantidade++;

    }

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
        }else {
            ponteiroFim=null;
        }
        return dadoInicio;
    }

    @Override
    public T desenfileirarFim() {
        T dadoFIM;
        if(estaVazio()){
            throw new NoSuchElementException("Fila vazia");
        }
        dadoFIM=ponteiroFim.getDado();
        ponteiroFim=ponteiroFim.getAnterior();
        quantidade--;
        if(!estaVazio()) {
            ponteiroFim.setProximo(null);
        }else {
            ponteiroInicio=null;
        }
        return dadoFIM;
    }

    @Override
    public void atualizarfim(T dado) {

    }

    @Override
    public void atulizarinicio(T dado) {

    }

    @Override
    public T frente() {
        return null;
    }

    @Override
    public T tras() {
        return null;
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
        return "";
    }

    @Override
    public String imprimirDeTrasPraFrente() {
        return "";
    }
}
