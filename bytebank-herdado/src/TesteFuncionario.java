
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario pedro = new Funcionario();
		pedro.setNome("Pedro Bueno");
		pedro.setCpf("436.114.768.03");
		pedro.setSalario(2600.00);
		
		System.out.println(pedro.getNome());
		System.out.println(pedro.getBonificacao());
		
		
	}

}
