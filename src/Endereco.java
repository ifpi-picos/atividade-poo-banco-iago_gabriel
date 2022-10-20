public class Endereco {
    private String logradouro;
    private int numero;
    private String limpar;
    private String bairro;
    private String cidade;
    private String uf;


    public Endereco(String logradouro, int numero,String limpar, String bairro, String cidade, String uf) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.limpar = limpar;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        
    }


    public String getLogradouro() {
        return logradouro;
    }


    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }


    public int getNumero() {
        return numero;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String getLimpar() {
        return limpar;
    }


    public void setLimpar(String limpar) {
        this.limpar = limpar;
    }



    public String getBairro() {
        return bairro;
    }


    public void setBairro(String bairro) {
        this.bairro = bairro;
    }


    public String getCidade() {
        return cidade;
    }


    public void setCidade(String cidade) {
        this.cidade = cidade;
    }


    public String getUf() {
        return uf;
    }


    public void setUf(String uf) {
        this.uf = uf;
    }
   
    void exibirEndereco(){
    System.out.println("Rua: "+this.getLogradouro());
    System.out.println("Numero: "+this.getNumero());
    System.out.println("Bairro: "+this.getBairro());
    System.out.println("Cidade: "+this.getCidade());
    System.out.println("Uf: "+this.getUf());
    }


}
