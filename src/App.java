import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {        
      Scanner l1 = new Scanner(System.in);
      final Random numAg = new Random();
      final Random numCon = new Random();

      String cpf;
      String nome,dataNasci;
      String rua,bairro,cidade,uf;
      int numeroMoradia;
      int opt1,opt2;
      int val1, val2;
      String cpfLog;
      ArrayList<ContaCorrente>contasCorr = new ArrayList<>();
      ArrayList<ContaPoupanca>contasPoup = new ArrayList<>();
      ArrayList<String>cpfs = new ArrayList<>();



      System.out.println("      Banco Mount      ");
      
      System.out.println();

      System.out.println("Crie sua conta gratuitmente!");

      while(true){
        System.out.println("Deseja criar: \nDigite * 1 * para Conta Corrente  ||  Digite * 2 * para Conta Poupança ");
        System.out.println("Caso já tenha uma conta no nosso banco digite 3 para fazer login!");
        opt1 = l1.nextInt();
        l1.nextLine();
        if(opt1 == 1)
        {

        System.out.print("Digite seu nome completo: ");
        nome = l1.nextLine();

        System.out.print("Digite seu CPF (XXX.XXX.XXX-XX): ");
         cpf = l1.nextLine();
         
        System.out.print("Digite sua data de nascimento (DD/MM/AAAA): ");
        dataNasci = l1.nextLine();
        
        System.out.println("====Endereço==== ");

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
  
        Endereco endereco = new Endereco(rua, numeroMoradia, bairro, cidade, uf);
        Cliente cliente = new Cliente(nome, cpf , dataNasci, endereco);
        ContaCorrente contaC = new ContaCorrente(numAg.nextInt(10,100),numCon.nextInt(10000,100000), 000, cliente,null, 1000.0);
        
        contasCorr.add(contaC);
        cpfs.add(cpf);
        System.out.println("Conta corrente criada com sucesso, obrigado por abrir uma conta no Banco Mount!");
        
        System.out.println("As Operações disponiveis são: \n1 - Saque \n2 - Deposito \n3 - Tranferência \n4 - Checar saldo \n5 - Sair do sistema");
        opt2 = l1.nextInt();
          if(opt2 == 1){//SAQUE
            System.out.print("Digite a quantia que deseja sacar: R$");
            val1 = l1.nextInt();
            contaC.saque(val1);
          }
          else if(opt2 == 2){//DEPOSITO
            System.out.print("Digite a quantia que depositar: R$");
            val1 = l1.nextInt();
            contaC.deposito(val1);
          }
          else if(opt2 == 3){//TRANSFERENCIA
            System.out.print("Digite o numero da conta para qual deseja transferir: ");
            val2 = l1.nextInt();
          }
          else if(opt2 == 4){//EXIBIR O SALDO DA CONTA
            contaC.mostrarSaldo();
          }
          else if(opt2==5){
            break;
          }
        

        } while(true) {
        if(opt1 == 2 ){
          
        System.out.print("Digite seu nome completo: ");
        nome = l1.nextLine();

        System.out.print("Digite seu CPF (XXX.XXX.XXX-XX): ");
        cpf = l1.nextLine();
        
        System.out.print("Digite sua data de nascimento (DD/MM/AAAA): ");
        dataNasci = l1.nextLine();
        
        System.out.println();

        System.out.println("====Endereço==== ");
        
        System.out.println();

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

        Endereco endereco = new Endereco(rua, numeroMoradia, bairro, cidade, uf);
        Cliente cliente = new Cliente(nome, cpf, dataNasci, endereco);
        ContaPoupanca contaP = new ContaPoupanca(numAg.nextInt(10,100),numCon.nextInt(10000,100000), 000, cliente,null, 1000.0);

        contasPoup.add(contaP);
        cpfs.add(cpf);

        System.out.println("Conta poupança criada com sucesso, obrigado por abrir uma conta no Banco Mount!");

        System.out.println("As Operações disponiveis são: \n1 - Saque \n2 - Deposito \n3 - Tranferência \n4 - Checar saldo \n5 - Sair do sistema");

        opt2 = l1.nextInt();

          if(opt2 == 1){//SAQUE
            System.out.print("Digite a quantia que deseja sacar: R$");
            val1 = l1.nextInt();
            contaP.saque(val1);
          }
          else if(opt2 == 2){//DEPOSITO
            System.out.print("Digite a quantia que depositar: R$");
            val1 = l1.nextInt();
            contaP.deposito(val1);
          }
          else if(opt2 == 3){//TRANSFERENCIA
            System.out.print("Digite o numero da conta para qual deseja transferir: ");
            val2 = l1.nextInt();
          }
          else if(opt2 == 4){//EXIBIR O SALDO DA CONTA
            contaP.mostrarSaldo();
          }
          else if(opt2==5){
            break;
          }
          l1.nextLine();
      }if(opt1 == 3){
        System.out.print("Para acessar sua conta, digite o cpf cadastrado na mesma: ");
        cpfLog = l1.nextLine();
        while(cpfs.contains(cpfLog) == false){
          System.out.println("ERRO, cpf não reconhecido, tente novamente!");
          System.out.println();
          System.out.print("Para acessar sua conta, digite o cpf cadastrado na mesma: ");
          cpfLog = l1.nextLine();
        }
          if(cpfLog.equals()){
            System.out.println();
        }
        break;
        }
      
      //ContaPoupanca conta2 = new ContaPoupanca(numAg.nextInt(10,100), numCon.nextInt(10000,100000), 000, cliente1,null,1000.0 );
        
        //System.out.println(conta1.getNumAgencia());
        //System.out.println(conta1.getNumConta());
       //System.out.println("O saldo da conta do cliente " + newCliente.getNome() + " é: " + conta1.getSaldo());
        
        /*conta1.mostrarSaldo();
        System.out.println("------------------------------------------------------------");
        conta1.transferencia(conta2,350.25);
        System.out.println("Novo saldo da conta principal de " + cliente1.getNome() + ": R$" + conta1.getSaldo());
        System.out.println("Novo saldo da conta secundaria de " + cliente1.getNome() + ": R$" + conta2.getSaldo());
        System.out.println("------------------------------------------------------------");

        conta1.saque(40.00);

        System.out.println("------------------------------------------------------------");

        conta1.deposito(100.00);
        conta1.mostrarSaldo();*/

        //endereco1.exibirEndereco();
      

        
    
      System.out.println(contasCorr);
      l1.close();
      }

  }
  }
