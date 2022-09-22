public class Conta {
    private int numAgencia;
    private int numConta;
    private double saldo;

    public Conta(int numAgencia, int numConta, float saldo){
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

    void checarSaldo(){
    }    
    
    
}
