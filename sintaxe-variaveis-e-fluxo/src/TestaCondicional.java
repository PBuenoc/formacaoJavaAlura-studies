
public class TestaCondicional {
	
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 17;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("Voce tem maior de idade");
		} else {
			if(quantidadePessoas >= 2) {
				System.out.println("Voce pode entrar por estar acompanhado");
			} else {
				System.out.println("Voce é menor de idade");
			}
		}
	}
}
