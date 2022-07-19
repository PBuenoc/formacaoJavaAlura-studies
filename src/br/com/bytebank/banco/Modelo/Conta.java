package br.com.bytebank.banco.Modelo;

/**
 * 
 * Classe representa o molde de uma conta
 * 
 * @author Pedro Bueno
 *
 */

public abstract class Conta{
	protected double saldo;
	protected int agencia;
	protected int numero;
	private Cliente titular;
	private static int total;   //Um unico total para todos os objetos conta, é um total da classe, não do objeto conta
	

	
	//Construtor, impõe regras. Utilizados para inicialização dos atributos
	/**
	* Construtor para inicializar o objeto a partir da agencia e numero.
	*
	*@param agencia
	*@param numero
	*/
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("O total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero =  numero;
		//this.saldo = 100;
		//System.out.println("Estou criando a conta "+ this.numero);
	}
	
	public abstract void deposita(double valor);
	
	/**
	* Valor precisa ser maior do que o saldo
	*
	*@param valor
	*@throws SaldoInsuficienteException
	*/
	
	public void saca(double valor) throws SaldoInsuficienteException{
		if (this.saldo+ 0.2 == valor) {
			System.out.println("Taxa de saque: 0.20");
		}
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor " + valor);
		}
		
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
		this.saca(valor); 
		destino.deposita(valor);
		
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int	 getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Não pode valor <= 0.");
			return;
		}
		this.numero = numero;
		
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Não pode ser valor menor ou igual a 0.");
			return;
		}
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public boolean equals(Object ref) {  //Sobrescreve a classe Object para alterar o equals
		
		Conta outra = (Conta) ref;
		
		if(this.agencia != outra.agencia) {
			return false;
		}
		if(this.numero != outra.numero) {
			return false;
		}
		return true;
		
	}
	
	@Override
	public String toString() {
		return "Numero: " + this.numero + ",Agencia: " + this.agencia;
	}
	
}



