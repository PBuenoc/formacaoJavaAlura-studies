package br.com.bytebank.banco.Modelo;

public class GuardadorDeObjetos {
	private Object[] referencias;
	private int posiçãoLivre;
	
	public GuardadorDeObjetos() {
		this.referencias = new Object[10];
		this.posiçãoLivre = 0;
	}
	
	public void adiciona(Object ref) {
		this.referencias[this.posiçãoLivre] = ref;
		this.posiçãoLivre++;
	}
	
	public int getQuantidadeDeElementos() {
		return this.posiçãoLivre;
		
	}

	public Object getReferencia(int pos) {
		return this.referencias[pos];
	}
}
