import java.util.Random;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {        
      Scanner l1 = new Scanner(System.in);
      final Random numAg = new Random();
      final Random numCon = new Random();

      String nome,cpf,dataNasci;
      String rua,bairro,cidade,uf;
      int numeroMoradia;
      int opt1;

      System.out.println("      Banco Mount      ");
      
      System.out.println();

      System.out.println("Opções:\n1 - Criar uma nova conta\n2 - Entrar na sua conta");
      opt1 = l1.nextInt();
      l1.nextLine();

      if(opt1 == 1){
        System.out.print("Digite seu nome completo: ");
        nome = l1.nextLine();

        System.out.print("Digite seu CPF: ");
        cpf = l1.nextLine();
        
        System.out.print("Digite sua data de nascimento (DD/MM/AAAA): ");
        dataNasci = l1.nextLine();
        
        System.out.print("Logradouro: ");
        rua = l1.nextLine();
        
        System.out.print("Numero: ");
        numeroMoradia = l1.nextInt();
        
        l1.nextLine();
        
        System.out.print("Bairro: ");
        bairro = l1.nextLine();
        
        System.out.print("Cidade: ");
        cidade = l1.nextLine();
        
        System.out.print("Unidade Federal: ");
        uf = l1.nextLine();
  
        Endereco endereco1 = new Endereco(rua, numeroMoradia, bairro, cidade, uf);
        Cliente cliente1 = new Cliente(nome, cpf, dataNasci, endereco1);
        ContaCorrente conta1 = new ContaCorrente(numAg.nextInt(10,100),numCon.nextInt(10000,100000), 000, cliente1,null, 1000.0);
        ContaCorrente conta2 = new ContaCorrente(numAg.nextInt(10,100), numCon.nextInt(10000,100000), 000, cliente1,null,1000.0 );

        System.out.println(conta1.getNumAgencia());
        System.out.println(conta1.getNumConta());
       //System.out.println("O saldo da conta do cliente " + newCliente.getNome() + " é: " + conta1.getSaldo());
        
        conta1.mostrarSaldo();
        System.out.println("------------------------------------------------------------");
        conta1.transferencia(conta2,350.25);
        System.out.println("Novo saldo da conta principal de " + cliente1.getNome() + ": R$" + conta1.getSaldo());
        System.out.println("Novo saldo da conta secundaria de " + cliente1.getNome() + ": R$" + conta2.getSaldo());
        System.out.println("------------------------------------------------------------");

        conta1.saque(40.00);

        System.out.println("------------------------------------------------------------");

        conta1.deposito(100.00);
        conta1.mostrarSaldo();

        //endereco1.exibirEndereco();
      }
      l1.close();
    }


}