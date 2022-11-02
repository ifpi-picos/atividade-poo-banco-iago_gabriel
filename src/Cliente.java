import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private String dataNasc;
    private Endereco endereco ;
    private List <Conta> contas = new ArrayList<>();

    

    public Cliente(String nome, String cpf, String dataNasc, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
    }



    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getCpf() {
        return cpf;
    }



    public void setCpf(String cpf) {
        this.cpf = cpf;
    }



    public String getDataNasc() {
        return dataNasc;
    }



    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }



    public Endereco getEndereco() {
        return endereco;
    }



    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }  
        

}

