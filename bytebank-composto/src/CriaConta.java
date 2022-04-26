import java.util.Scanner;


public class CriaConta {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("===================== Crie sua conta =====================");
		double valor = 0;
		System.out.println("Informe seu nome: ");
		Cliente cliente = new Cliente();
		cliente.nome = scan.next();
		System.out.println("Seu cpf: ");
		cliente.cpf = scan.next();
		if(cliente.cpf.length() != 11) {
			System.out.println("CPF INVÁLIDO");
		} else {
			System.out.println("Sua profissão: ");
			cliente.profissao = scan.next();
			
			Conta conta = new Conta();
			
			System.out.println("\nParabéns, conta criada!\n");
			
			int opcao = 0;
			while(opcao <= 5) {
				System.out.println("Escolha a operação:\n"
						+ "1 - Informações do cliente\n"
						+ "2 - Saldo\n"
						+ "3 - Adicionar\n"
						+ "4 - Sacar\n"
						+ "5 - Transferir\n"
						+ "6 - Sair");
				opcao = scan.nextInt();
				switch(opcao){
					case 1:
						System.out.println("Nome: " + cliente.nome +
								"\nCPF: " + cliente.cpf +
								"\nProfissão: " + cliente.profissao);
						break;
					case 2:
						System.out.println("Seu saldo é: R$" + conta.getSaldo());
						break;
					case 3:
						System.out.println("Informe o valor a ser depositado:");
						valor = scan.nextDouble();
						conta.deposita(valor);
						break;
					case 4:
						System.out.println("Informe o valor a ser sacado:");
						valor = scan.nextDouble();
						if(conta.getSaldo() >= valor) {
							conta.saca(valor);
						} else {
							System.out.println("Valor insuficiente");
						}
						break;
					case 5:
						System.out.println("Item indisponível");
						break;
					default:
						
				}
				System.out.println("\n");
			}
			System.out.println("Obrigado, até mais!");
		}	
	}
	
}
