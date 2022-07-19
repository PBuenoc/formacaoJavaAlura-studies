package br.com.bytebank.banco.Testes.util;

import java.util.ArrayList;

import br.com.bytebank.banco.Modelo.Conta;
import br.com.bytebank.banco.Modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		//Cria um array
		ArrayList<Conta> lista = new ArrayList<>(); //Generics
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc); //Adiciona o elemento ao array
		
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 22);
		boolean jaExiste = lista.contains(cc3);
		
		System.out.println("Já existe: " + jaExiste);
		
		for(Conta conta : lista) {
			if(conta.equals(cc2)) {
				System.out.println("Já tenho essa conta!");
			}
		}
		
		for(Conta conta: lista) {
			System.out.println(conta);
		}
		
	}

}
