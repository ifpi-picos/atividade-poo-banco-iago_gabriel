public class ContaPoupanca extends Conta{
    private Double rendimento;

    public ContaPoupanca(int numAgencia, int numConta, double saldo, Cliente cliente,Notificacao notificacao, Double rendimento) {
        super(numAgencia, numConta, saldo, cliente, notificacao);
        this.rendimento = rendimento;
    }

    public Double getRendimento() {
        return rendimento;
    }
    
}
