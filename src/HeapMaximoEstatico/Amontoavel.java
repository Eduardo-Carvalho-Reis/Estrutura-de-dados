package HeapMaximoEstatico;

public interface Amontoavel<T> {
    void inserir(T dado) throws OverflowException;	// C
    T obterRaiz();			// R
    T extrair() throws UnderflowException;			// D

    //auxiliares
    String imprimir();
    boolean estaVazia();
    boolean estaCheia();
}
