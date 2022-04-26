
public class CriaConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		
		primeiraConta.saldo += 100;
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("O saldo da primeira conta é " + primeiraConta.saldo);
		System.out.println("O saldo da segundo conta é " + segundaConta.saldo);
		

	}

}
