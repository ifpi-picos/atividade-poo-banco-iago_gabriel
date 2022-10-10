public class Cliente {
    private String nome;
    private String cpf;
    private String dataNasc;
    private Endereco endereco;
    private Conta conta;

    public Cliente(String nome, String cpf, String dataNasc, Endereco endereco,Conta conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

    public Conta getConta() {
        return conta;
    }
}
