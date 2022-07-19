/**
 * 
 */
package br.com.bytebank.banco.Modelo;

/**
 * @author buenocc
 *
 */
public class GuardadorDeContas {

	private Conta[] referencias;
	private int posi��oLivre;
	
	public GuardadorDeContas() {
		this.referencias = new Conta[10];
		this.posi��oLivre = 0;
	}
	
	public void adiciona(Conta ref) {
		this.referencias[this.posi��oLivre] = ref;
		this.posi��oLivre++;
	}
	
	public int getQuantidadeDeElementos() {
		return this.posi��oLivre;
		
	}

	public Conta getReferencia(int pos) {
		return this.referencias[pos];
	}
}
