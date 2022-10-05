public class Cliente {
    private String nome;
    private String cpf;
    private String dataNasc;
    private String endereco;


    public Cliente(String nome, String cpf, String dataNasc, String endereco) {
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

    public String getEndereco() {
        return endereco;
    }
    
    public Cliente(){
    }
    public static void main(String[] args) {
        Cliente newCliente;
        newCliente = new Cliente();

        newCliente.nome = "Gabriel";
        newCliente.cpf = "000.000.000-00";
        newCliente.dataNasc = "26/12/2003";
        newCliente.endereco = "Cidade: Picos, PI \nBairro: ..... \nRua: .... \nNumero: xx";

        System.out.println("O nome do cliente é: " + newCliente.nome);
        System.out.println("O seu CPF é: " + newCliente.cpf);
        System.out.println("Sua data de nascimento é: " + newCliente.dataNasc);
        System.out.println("O seu endereço é: " + newCliente.endereco);
    }

}
