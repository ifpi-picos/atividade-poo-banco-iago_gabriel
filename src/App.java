import java.util.Scanner;

public class App {
   
  public static void main(String[] args) {  
      //criação de 2 endereços, clientes e contas para testar um pouco os metodos      
      Scanner ler = new Scanner(System.in);
      Endereco endereco1 = new Endereco(ler.nextLine(),ler.nextInt(),ler.nextLine(), ler.nextLine(), ler.nextLine(), ler.nextLine() );
      //Endereco endereco2 = new Endereco("Rua 123", 20, "Bairro T2", "Picos", "PI");

      Cliente cliente1 = new Cliente("Gabriel",  "123456789", "26/12/2003", endereco1);
      //Cliente cliente2 = new Cliente("Iago", "222333444", "00/00/0000", endereco2);

      Conta conta1 = new Conta(1234, 2222000, 500.00, cliente1);
      Conta conta2 = new Conta(1001, 123, 000, cliente1);

      //System.out.println("O saldo da conta do cliente " + newCliente.getNome() + " é: " + conta1.getSaldo());
      
      conta1.mostrarSaldo(conta1);
      System.out.println("------------------------------------------------------------");
      conta1.transferencia(conta2,350.25);
      System.out.println("Novo saldo da conta principal de " + cliente1.getNome() + ": R$" + conta1.getSaldo());
      System.out.println("Novo saldo da conta secundaria de " + cliente1.getNome() + ": R$" + conta2.getSaldo());
      System.out.println("------------------------------------------------------------");

      conta1.saque(40.00);

      System.out.println("------------------------------------------------------------");

      conta1.deposito(100.00);
      conta1.mostrarSaldo(conta1);

      endereco1.exibirEndereco();

    
  }

}