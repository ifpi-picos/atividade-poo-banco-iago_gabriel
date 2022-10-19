public class Conta {
    private int numAgencia;
    private int numConta;
    private double saldo;
    private Cliente cliente;

    public Conta(int numAgencia, int numConta, double saldo,Cliente cliente){
        this.numAgencia = numAgencia;
        this.numConta = numConta;
        this.saldo = saldo;
        this.cliente = cliente;
      
    }
    
    public int getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }

     public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    //o saldo de sua conta, depositar, sacar e transferir
    void mostrarSaldo(double saldo){
        System.out.println(saldo);
    }
    double saque(double valor){
        double saldoNovo = this.saldo - valor;
        this.saldo = saldoNovo;
        return saque(saldoNovo);
    }
    double deposito(double quantia){
        double saldoNovo = this.saldo + quantia;
        this.saldo = saldoNovo;
        return deposito(saldoNovo);
    }
    double transferencia(Conta recebe, double valor){
        this.saldo -= valor;
        recebe.saldo += valor;
        System.out.println("Foram tranferidos " + valor + " reais da conta principal do cliente " + cliente.getNome() + " para a conta secundaria do cliente " + recebe.getCliente().getNome());
        return valor;
        
    }
    
    
}
