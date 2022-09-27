import java.time.LocalDate;

public class Cliente {
    private String nome;
    private String cpf;
    private LocalDate dataNasc;
    private String endereco;

    public Cliente(String nome, String cpf, LocalDate dataNasc, String endereco) {
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

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public String getEndereco() {
        return endereco;
    }
    
}
