public class ContaPoupanca extends Conta{
    private Double rendimento = 0.1;

    public ContaPoupanca(int numAgencia, int numConta, double saldo, Cliente cliente,Notificacao notificacao, Double rendimento) {
        super(numAgencia, numConta, saldo, cliente, notificacao);
        this.rendimento = this.getSaldo() * 0.10;
    }

    public Double getRendimento() {
        return this.rendimento;
    }

    public void setRendimento(Double rendimento) {
        this.rendimento = rendimento;
    }

    @Override
    public double deposito(double quantia) {
        double valorComRendimento = quantia + (quantia * rendimento);
        return super.deposito(valorComRendimento);
    }

    @Override
    public boolean transferencia(Conta recebe, double valor) {
        // valor + taxa
        double valortax = valor * 0.05;

        // dimuir do saldo atual valor + taxa
        this.saldo -= valortax;
    
        // enviar pra outra conta o valor original
        recebe.saldo += valor;
        
        getNotificacao().enviaNotificacao("transferencia", valor);

        return true;
    }

    @Override
    public String toString() {
        return    this.getNumAgencia()+ ", "
                 + this.getNumConta()+ ", "
                 + this.getSaldo()+ ", "
                 + this.getCliente().getNome()+ ", "
                 + this.getNotificacao()+ ", "
                 + this.getRendimento();
    }

    
}
