import java.time.LocalDate;

public class Cliente {
    private String nome;
    private int cpf;
    private LocalDate dataNasc;
    private String endereco;

    public Cliente(String nome, int cpf, LocalDate dataNasc, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public String getEndereco() {
        return endereco;
    }
    
}
