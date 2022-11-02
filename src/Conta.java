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
    void mostrarSaldo(){
        System.out.println("O seu saldo atual é de R$" + this.getSaldo());
        System.out.println();
    }
    double saque(double valor){
        if(valor < saldo || valor == saldo ){
        double saldoNovo = this.saldo - valor;
        saldo = saldoNovo;
        System.out.println("Saque de R$" + valor + " feito com sucesso.");
        System.out.println();
        }else {
            System.out.println("Quantia insdiponivel para saque, tente novamente com um valor menor!");
        }
        return saldo;
    }
    double deposito(double quantia){
        double saldoNovo = this.saldo + quantia;
        saldo = saldoNovo;
        System.out.println("Deposito de R$" + quantia + " efetuado com sucesso!");
        System.out.println();
        return saldo;
    }
    double transferencia(Conta recebe, double valor){
        if(valor < saldo || valor == saldo){
        this.saldo -= valor;
        recebe.saldo += valor;
        System.out.println("Foram tranferidos " + valor + " reais da conta principal do cliente " + cliente.getNome() + " para a conta secundaria do cliente " + recebe.getCliente().getNome());
        System.out.println();
        }else{
            System.out.println("Quantia não disponivel para tranferência, tente novamente com um valor menor!");
        }
        return valor;
        
    }
    
    
}
