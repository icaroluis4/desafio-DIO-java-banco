public class Main {

	public static void main(String[] args) {
		Cliente icaro = new Cliente();
		icaro.setNome("Icaro");
		
		Conta cc = new ContaCorrente(icaro);
		Conta poupanca = new ContaPoupanca(icaro);
        Conta investimento = new ContaInvestimento(icaro);

		cc.depositar(150);
		cc.transferir(100, poupanca);
        cc.transferir(30, investimento);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
        investimento.imprimirExtrato();
	}

}