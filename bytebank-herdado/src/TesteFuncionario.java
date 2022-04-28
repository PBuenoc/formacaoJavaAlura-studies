
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		Gerente pedro = new Gerente();
		pedro.setNome("Pedro Bueno");
		pedro.setCpf("436.114.768.03");
		pedro.setSalario(2600.00);
		
		System.out.println(pedro.getNome());
		System.out.println(pedro.getBonificacao());
		
		
	}

}
