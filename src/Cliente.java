public class Cliente {
    private String nome;
    private String cpf;
    private String dataNasc;
    private Endereco endereco;
    

    public Cliente(String nome, String cpf, String dataNasc, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
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

    }

