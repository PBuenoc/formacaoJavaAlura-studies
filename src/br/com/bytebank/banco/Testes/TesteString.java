package br.com.bytebank.banco.Testes;

public class TesteString {

	public static void main(String[] args) {
		
		
		String nom = "ALURA";
		CharSequence cs = new StringBuilder("al");

		nom = nom.replace("AL", cs);

		System.out.println(nom);
		
		
		String vazio = "        Alura   ";
		String outroVazio = vazio.trim();
		
		System.out.println(vazio.contains("Alu"));
		System.out.println(outroVazio);
		
		String nome = "Alura"; //object literal (sintaxe literal para criar um objeto.
		//String nome = new String("Pedro");
		
		//int pos = nome.indexOf("ur");
		//System.out.println(pos);
	
		System.out.println(nome.length());
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
//		String sub = nome.substring(1);
//		System.out.println(sub);
		
		//char c = nome.charAt(0);
		//System.out.println(c);
		
		//char c ='A';
		//char d = 'a';
		//String outra = nome.replace(c, d);
		
		//String outra = nome.toLowerCase()
		
		
//		System.out.println(nome); //Strings possuem IMUTABILIDADE, ou seja, não podem ser alteradas, é necesário criar outra.
//		System.out.println(outra);
		
		
	}

}
