public class ContaCorrente extends Conta{
    private Double chequeEspecial;

    public ContaCorrente(int numAgencia, int numConta, double saldo, Cliente cliente,Notificacao notificacao,Double chequeEspecial) {
        super(numAgencia, numConta, saldo, cliente,notificacao);
        this.chequeEspecial = chequeEspecial;
    }
    
    public Double getChequeEspecial() {
        return chequeEspecial;
    }

    Double sacarCheque(Double valor){
        if(valor <= chequeEspecial){
        this.chequeEspecial = chequeEspecial - valor;
        }else{
            System.out.println("Valor indisponivel para saque no Cheuque especial por favor tente novamente com um valor menor");
        }
        return chequeEspecial;
    }

}