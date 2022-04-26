
public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta contaDoPedro = new Conta();
		contaDoPedro.saldo = 100;
		contaDoPedro.deposita(50);
		
		System.out.println("Seu saldo é R$"+contaDoPedro.saldo);
		
		boolean conseguiuRetirar = contaDoPedro.saca(20);
		if(conseguiuRetirar == true) {
			System.out.println("Seu novo saldo é R$" + contaDoPedro.saldo);
		} else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println(conseguiuRetirar);
		
		Conta contaDaLuana = new Conta();
		contaDaLuana.deposita(1000);
		System.out.println(contaDaLuana.saldo);
		
		boolean sucessoTransferencia = contaDaLuana.transfere(200, contaDoPedro);
		if(sucessoTransferencia == true) {
			System.out.println("Transferência relizada com sucesso!");
		} else {
			System.out.println("Saldo insuficiente");
		}
		
		System.out.println(contaDaLuana.saldo);
		System.out.println(contaDoPedro.saldo);
		
		
		
	}

}
