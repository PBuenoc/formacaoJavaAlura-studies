package br.com.bytebank.banco.Testes;

import br.com.bytebank.banco.Modelo.Cliente;
import br.com.bytebank.banco.Modelo.Conta;
import br.com.bytebank.banco.Modelo.ContaCorrente;
import br.com.bytebank.banco.Modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		//int[] refs = {1,2,3,4,5}; <- FORMA LITERAL
		Conta[] contas = new Conta[5];
		Object[] referencias = new Object[5]; //pode guardar qualquer tipo de referência
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		ContaCorrente cc1 = new ContaCorrente(121, 11);
		contas[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(132, 22);
		contas[1] = cc2;
		
		referencias[1] = cc2;
		
		System.out.println( contas[1].getNumero() );
		
		ContaPoupanca ref = (ContaPoupanca) contas[1]; //type cast
		
		Object referenciaGenerica = referencias[1];
		
		System.out.println(((ContaPoupanca) referenciaGenerica).getNumero());
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
	}

}
