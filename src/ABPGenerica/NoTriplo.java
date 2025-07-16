package ABPGenerica;

public class NoTriplo <T>{
    private T dado;

    private NoTriplo<T> genitor;
    private NoTriplo<T>filhoEsquerdo;
    private NoTriplo<T>filhoDireito;

    public T getDado(){
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public NoTriplo<T> getGenitor() {
        return genitor;
    }

    public void setGenitor(NoTriplo<T> genitor) {
        this.genitor = genitor;
    }

    public NoTriplo<T> getFilhoEsquerdo() {
        return filhoEsquerdo;
    }

    public void setFilhoEsquerdo(NoTriplo<T> filhoEsquerdo) {
        this.filhoEsquerdo = filhoEsquerdo;
    }

    public NoTriplo<T> getFilhoDireito() {
        return filhoDireito;
    }

    public void setFilhoDireito(NoTriplo<T> filhoDireito) {
        this.filhoDireito = filhoDireito;
    }
}
