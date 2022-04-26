
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24426);
		
		System.out.println("O numero da conta é: "+conta.getNumero());
		
		System.out.println("O numero da agência é: " + conta.getAgencia());
		
		Cliente pedro = new Cliente();
		
		pedro.setNome("Pedro Bueno");
		
		conta.setTitular(pedro);
		
		System.out.println(pedro.getNome());
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setNome("Luana");
		System.out.println(conta.getTitular().getNome());
	}
}
