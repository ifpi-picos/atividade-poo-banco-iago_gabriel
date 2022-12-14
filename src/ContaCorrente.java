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
            System.out.println("Valor indisponivel para saque no Cheque especial por favor tente novamente com um valor menor");
        }
        return chequeEspecial;
    }

    @Override
    boolean transferencia(Conta recebe, double valor) {
        return super.transferencia(recebe, valor);
    }

    @Override
    public String toString() {
        return    this.getNumAgencia()+ ", "
                + this.getNumConta()+ ", "
                + this.getSaldo()+ ", "
                + this.getCliente().getNome()+ ", "
                + this.getNotificacao()+ ", "
                + this.getChequeEspecial();
    }

}