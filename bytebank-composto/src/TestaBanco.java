public class TestaBanco { 
   
	public static void main(String[] args) { 
        
		Cliente cliente = new Cliente(); 
        cliente.nome = "Paulo Silveira";
        cliente.cpf = "222.222.222-22";
        cliente.profissao = "programador";
        
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.deposita(100);
        
        contaDoPaulo.titular = cliente;
        System.out.println(contaDoPaulo.titular.nome);
        
    }
}
