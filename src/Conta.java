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


    public Cliente getCliente() {
        return cliente;
    }


    public int getNumAgencia() {
        return numAgencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        saldo = 120.50;
        return saldo;
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
       
    
    
}
