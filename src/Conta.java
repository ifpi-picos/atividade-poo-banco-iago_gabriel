public class Conta {
    private int numAgencia;
    private int numConta;
    private double saldo;
    

    public Conta(int numAgencia, int numConta, float saldo,Cliente cliente){
        this.numAgencia = numAgencia;
        this.numConta = numConta;
        this.saldo = saldo;
      
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
    void saque(double valor){
        double saldoNovo = this.saldo - valor;
        this.saldo = saldoNovo;
    }
    void deposito(double quantia){
        double saldoNovo = this.saldo + quantia;
        this.saldo = saldoNovo;
    }
       
    
    
}
