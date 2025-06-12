package FILADinamicaDupla;

public class NodoDuplo <T>{
    private NodoDuplo<T> proximo;
    private NodoDuplo<T> anterior;
    private T dado;


    public NodoDuplo(){

    }
    public NodoDuplo( T dado){
        this.dado=dado;
    }

    public NodoDuplo<T> getProximo() {
        return proximo;
    }

    public void setProximo(NodoDuplo<T> proximo) {
        this.proximo = proximo;
    }

    public NodoDuplo<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDuplo<T> anterior) {
        this.anterior = anterior;
    }

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }
}
