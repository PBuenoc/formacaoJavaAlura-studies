package br.com.bytebank.banco.Testes;

import br.com.bytebank.banco.Modelo.*;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException{

		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		System.out.println("CC INCIO "+cc.getSaldo());
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		System.out.println("CP INICIO "+cp.getSaldo());
		
		cc .transfere(10.0, cp);
		
		System.out.println("CC FIM "+cc.getSaldo());
		System.out.println("CP FIM "+cp.getSaldo());
		
	}

}
