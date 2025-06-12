package ListaDinamica;

public class NoDuplo<T>{
    private NoDuplo<T> proximo;
    private NoDuplo<T> anterior;
    private T dado;


    public NoDuplo(){

    }
    public NoDuplo(T dado){
        this.dado=dado;
    }

    public NoDuplo<T> getProximo() {
        return proximo;
    }

    public void setProximo(NoDuplo<T> proximo) {
        this.proximo = proximo;
    }

    public NoDuplo<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NoDuplo<T> anterior) {
        this.anterior = anterior;
    }

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }
}
