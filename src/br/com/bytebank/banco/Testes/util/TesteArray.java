package br.com.bytebank.banco.Testes.util;

import java.util.ArrayList;
import java.util.List;

public class TesteArray {

	public static void main(String[] args) {
		
		int[] idades = new int[5];
		String[] nomes = new String[5];
		
		int idade = 29; //Integer
		 
		Integer idadeRef = Integer.valueOf(29);
		
		//List<Number> referencias = new ArrayList<>(); Melhor forma de fazer um array de números	
		Double preçoRef = Double.valueOf(13.0);
		System.out.println(preçoRef);
		
		String s = "10";
		// Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);	
		System.out.println(numero + 10);
		 
		List<Integer> numeros = new ArrayList();
		numeros.add(29); //Autoboxing
		 	
	}

}
