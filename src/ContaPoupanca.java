public class ContaPoupanca extends Conta{
    private Double rendimento;

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
    public String toString() {
        return    this.getNumAgencia()+ ", "
                 + this.getNumConta()+ ", "
                 + this.getSaldo()+ ", "
                 + this.getCliente().getNome()+ ", "
                 + this.getNotificacao()+ ", "
                 + this.getRendimento();
    }

    
}
