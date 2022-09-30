public class ContaInvestimento extends Conta{
    
    public ContaInvestimento(Cliente cliente) {
		super(cliente);
       
	}

    @Override
    public double getSaldo() {
		return this.saldo + this.saldo * 0.1;
	}

    @Override
    public void imprimirExtrato() {
        // TODO Auto-generated method stub

        System.out.println("-- Extrato Conta Investimento + 10% --");
		super.imprimirInfosComuns();
        System.out.println( "SALDO + 10%: " + getSaldo());
        
    }
}
