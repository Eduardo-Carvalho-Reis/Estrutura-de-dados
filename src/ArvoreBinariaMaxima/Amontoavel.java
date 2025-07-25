package ArvoreBinariaMaxima;


public interface Amontoavel<T> {
	/**
	 * Insere um novo elemento no heap.
	 * 
	 * @param dado o elemento a ser inserido
	 */
	void inserir(T dado);	// C

	/**
	 * Extrai e remove o elemento raiz do heap.
	 * 
	 * @return o elemento raiz removido
	 */
	T extrair();				// D

	/**
	 * Obtém o elemento raiz do heap sem removê-lo.
	 * 
	 * @return o elemento raiz
	 */
	T obterRaiz();			// R

	//auxiliares
	/**
	 * Retorna uma representação em string do heap.
	 * 
	 * @return string representando o estado atual do heap
	 */
	String imprimir();

	/**
	 * Verifica se o heap está vazio.
	 * 
	 * @return true se o heap estiver vazio, false caso contrário
	 */
	boolean estaVazia();

	/**
	 * Verifica se o heap está cheio.
	 * 
	 * @return true se o heap estiver cheio, false caso contrário
	 */
	boolean estaCheia();
}