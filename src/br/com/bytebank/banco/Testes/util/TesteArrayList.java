package br.com.bytebank.banco.Testes.util;

import java.util.ArrayList;

import br.com.bytebank.banco.Modelo.Conta;
import br.com.bytebank.banco.Modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		//Cria um array
		ArrayList<Conta> lista = new ArrayList<>(); //Generics
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc); //Adiciona o elemento ao array
		
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		System.out.println(lista.size()); //Printa a quantidade de elementos no array
		
		Conta ref = lista.get(0); //Pega o elemento na posição informada. Necessário fazer cast
		System.out.println(ref.getNumero());
		
		lista.remove(0); //Remove o elemento na posição informada
		System.out.println(lista.size());
///////////////////////////////////////////////////////////////////////////////////////////
		
		Conta cc3 = new ContaCorrente(33, 33);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(33, 44);
		lista.add(cc4);
		
		for(int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		System.out.println("------------------------------------");
		
		for(Object oRef : lista) {
			System.out.println(oRef);
		}
		
	}

}
