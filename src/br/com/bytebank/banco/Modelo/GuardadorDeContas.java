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
	private int posiçãoLivre;
	
	public GuardadorDeContas() {
		this.referencias = new Conta[10];
		this.posiçãoLivre = 0;
	}
	
	public void adiciona(Conta ref) {
		this.referencias[this.posiçãoLivre] = ref;
		this.posiçãoLivre++;
	}
	
	public int getQuantidadeDeElementos() {
		return this.posiçãoLivre;
		
	}

	public Conta getReferencia(int pos) {
		return this.referencias[pos];
	}
}
