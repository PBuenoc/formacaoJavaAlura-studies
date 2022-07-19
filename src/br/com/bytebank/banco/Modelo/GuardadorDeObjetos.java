package br.com.bytebank.banco.Modelo;

public class GuardadorDeObjetos {
	private Object[] referencias;
	private int posi��oLivre;
	
	public GuardadorDeObjetos() {
		this.referencias = new Object[10];
		this.posi��oLivre = 0;
	}
	
	public void adiciona(Object ref) {
		this.referencias[this.posi��oLivre] = ref;
		this.posi��oLivre++;
	}
	
	public int getQuantidadeDeElementos() {
		return this.posi��oLivre;
		
	}

	public Object getReferencia(int pos) {
		return this.referencias[pos];
	}
}
