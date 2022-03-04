package banco;

public class Main {

	public static void main(String[] args) {
		Cliente jose = new Cliente();
		jose.setNome("Jose");
		
		Conta jcc = new ContaCorrente(jose);
		Conta jpoupanca = new ContaPoupanca(jose);

		jcc.depositar(100);
		jcc.transferir(100, jpoupanca);
		
		jcc.imprimirExtrato();
		jpoupanca.imprimirExtrato();
		
		Cliente maria = new Cliente();
		maria.setNome("Maria");
		
		Conta mcc = new ContaCorrente(maria);
		Conta mpoupanca = new ContaPoupanca(maria);
		
		mcc.imprimirExtrato();
		jpoupanca.transferir(10, mcc);
		jpoupanca.imprimirExtrato();
		mcc.imprimirExtrato();
		

		
	}

}
