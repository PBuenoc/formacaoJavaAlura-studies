package br.com.bytebank.banco.Testes;

import br.com.bytebank.banco.Modelo.Cliente;
import br.com.bytebank.banco.Modelo.Conta;
import br.com.bytebank.banco.Modelo.ContaCorrente;
import br.com.bytebank.banco.Modelo.GuardadorDeContas;
import br.com.bytebank.banco.Modelo.GuardadorDeObjetos;

public class TesteAdapterObjects {
	
	public static void main(String[] args) {
		
		GuardadorDeObjetos guardador = new GuardadorDeObjetos();
		
		Conta cc = new ContaCorrente(22, 11);
		guardador.adiciona(cc);
		
		Cliente cliente = new Cliente();
		cliente.setNome("Pedro");
		guardador.adiciona(cliente);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);	
		
		Conta ref = (Conta) guardador.getReferencia(0);
		System.out.println(ref.getNumero());
		
		Cliente refCliente = (Cliente) guardador.getReferencia(1);
		System.out.println(refCliente.getNome());
	}
	
}
