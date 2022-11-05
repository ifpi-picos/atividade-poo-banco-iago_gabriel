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
      int indice,indiceCon;
      int opt1,opt2,opt3;
      int val1;
      Double val2;
      String cpfLog;
      int numContaTranfere;
      ArrayList<ContaCorrente>contasCorr = new ArrayList<>();
      ArrayList<ContaPoupanca>contasPoup = new ArrayList<>();
      ArrayList<String>cpfs = new ArrayList<>();
      ArrayList<Integer>numerosContasCorr = new ArrayList<>();
      ArrayList<Integer>numerosContasPoup = new ArrayList<>();


    while(true){
      System.out.println("      Banco Mount      ");
      
      System.out.println();

      System.out.println("Crie sua conta gratuitmente!");
      System.out.println();
      System.out.println("Deseja criar: \nDigite * 1 * para Conta Corrente  ||  Digite * 2 * para Conta Poupança ");
      System.out.println("Caso já tenha uma conta no nosso banco digite 3 para fazer login!");
      while(true){
        
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
        ContaCorrente contaC = new ContaCorrente(numAg.nextInt(10,100), numCon.nextInt(10000,100000), 000, cliente,null, 1000.0);        
        
        contasCorr.add(contaC);
        numerosContasCorr.add(contaC.getNumConta());
        cpfs.add(cpf);

        System.out.println();
        System.out.println("Conta corrente criada com sucesso, obrigado por abrir uma conta no Banco Mount!");
        System.out.println();
        System.out.println("Os Dados da sua conta são: ");
        System.out.println();
        System.out.println("Numero da agencia: " + contaC.getNumAgencia());
        System.out.println("Numero da conta: " + contaC.getNumConta());
        System.out.println("Nome: " + contaC.getCliente().getNome());
        System.out.println("Cpf: " + contaC.getCliente().getCpf());
        System.out.println("Data de nascimento: " + contaC.getCliente().getDataNasc());
        System.out.println("Endereço:\nRua:  " + contaC.getCliente().getEndereco().getLogradouro());
        System.out.println("Bairro: "+ contaC.getCliente().getEndereco().getBairro());
        System.out.println("Numero da residencia: "+ contaC.getCliente().getEndereco().getNumero());
        System.out.println("Cidade: "+ contaC.getCliente().getEndereco().getCidade());
        System.out.println("Estado: "+ contaC.getCliente().getEndereco().getUf());
        System.out.println();
        if(contasCorr.size()>1)
          {
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
            numContaTranfere = l1.nextInt();
            
            while((numerosContasCorr.contains(numContaTranfere) == false)){
                System.out.println("ERRO, numero da conta não localizado, tente novamente!");
                System.out.println();
                System.out.print("Para realizar o deposito, digite o numero da conta para qual deseja tranferir: ");
                numContaTranfere = l1.nextInt();
              }
              System.out.print("Digite a quantia que deseja tranferir: R$");
              val2 = l1.nextDouble();
              indiceCon = numerosContasCorr.indexOf(numContaTranfere);
              contaC.transferencia(contasCorr.get(indiceCon),val2);

          }
          else if(opt2 == 4){//EXIBIR O SALDO DA CONTA
            contaC.mostrarSaldo();
          }
          else if(opt2==5){
            break;
          }
        }else {
          System.out.println("As Operações disponiveis são: \n1 - Saque \n2 - Deposito \n3 - Checar saldo \n4 - Sair do sistema");
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
          else if(opt2 == 3){//EXIBIR O SALDO DA CONTA
            contaC.mostrarSaldo();
          }
          else if(opt2==4){
            break;
          }
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
        
        numerosContasPoup.add(contaP.getNumConta());
        contasPoup.add(contaP);
        cpfs.add(cpf);

        System.out.println();
        System.out.println("Conta poupança criada com sucesso, obrigado por abrir uma conta no Banco Mount!");
        System.out.println();
        System.out.println("Os Dados da sua conta são: ");
        System.out.println();
        System.out.println("Numero da agencia: " + contaP.getNumAgencia());
        System.out.println("Numero da conta: " + contaP.getNumConta());
        System.out.println("Nome: " + contaP.getCliente().getNome());
        System.out.println("Cpf: " + contaP.getCliente().getCpf());
        System.out.println("Data de nascimento: " + contaP.getCliente().getDataNasc());
        System.out.println("Endereço:\nRua:  " + contaP.getCliente().getEndereco().getLogradouro());
        System.out.println("Bairro: "+ contaP.getCliente().getEndereco().getBairro());
        System.out.println("Numero da residencia: "+ contaP.getCliente().getEndereco().getNumero());
        System.out.println("Cidade: "+ contaP.getCliente().getEndereco().getCidade());
        System.out.println("Estado: "+ contaP.getCliente().getEndereco().getUf());


        if(contasPoup.size()>1)
          {
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
            numContaTranfere = l1.nextInt();
            
            while((numerosContasPoup.contains(numContaTranfere) == false)){
                System.out.println("ERRO, numero da conta não localizado, tente novamente!");
                System.out.println();
                System.out.print("Para realizar o deposito, digite o numero da conta para qual deseja tranferir: ");
                numContaTranfere = l1.nextInt();
              }
              System.out.print("Digite a quantia que deseja tranferir: R$");
              val2 = l1.nextDouble();
              indiceCon = numerosContasPoup.indexOf(numContaTranfere);
              contaP.transferencia(contasPoup.get(indiceCon),val2);

          }
          else if(opt2 == 4){//EXIBIR O SALDO DA CONTA
            contaP.mostrarSaldo();
          }
          else if(opt2==5){
            break;
          }
        }else {
          System.out.println("As Operações disponiveis são: \n1 - Saque \n2 - Deposito \n3 - Checar saldo \n4 - Sair do sistema");
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
          else if(opt2 == 3){//EXIBIR O SALDO DA CONTA
            contaP.mostrarSaldo();
          }
          else if(opt2==4){
            break;
          }
        }
          l1.nextLine();
      }if(opt1 == 3){
        System.out.println("A conta que deseja acessar é: \n    1 - Corrente    |    2 - Poupança");
        opt3 = l1.nextInt();
        l1.nextLine();
        if(opt3 == 1){
          System.out.print("Para acessar sua conta, digite o cpf cadastrado na mesma: ");
          cpfLog = l1.nextLine();
          
          while((cpfs.contains(cpfLog) == false)){
              System.out.println("ERRO, cpf não reconhecido, tente novamente!");
              System.out.println();
              System.out.print("Para acessar sua conta, digite o cpf cadastrado na mesma: ");
              cpfLog = l1.nextLine();
             }
          indice =cpfs.indexOf(cpfLog);
          ContaCorrente contaCo = new ContaCorrente(1, 1, 10.0, null, null, null);
          contaCo = contasCorr.get(indice);
  
          System.out.println("Bem vindo de volta!"+ contaCo.getCliente().getNome());
          System.out.println();
          if(contasCorr.size()>1)
          {
          System.out.println("As Operações disponiveis são: \n1 - Saque \n2 - Deposito \n3 - Tranferência \n4 - Checar saldo \n5 - Sair do sistema");
          opt2 = l1.nextInt();
          if(opt2 == 1){//SAQUE
            System.out.print("Digite a quantia que deseja sacar: R$");
            val1 = l1.nextInt();
            contaCo.saque(val1);
          }
          else if(opt2 == 2){//DEPOSITO
            System.out.print("Digite a quantia que depositar: R$");
            val1 = l1.nextInt();
            contaCo.deposito(val1);
          }
          else if(opt2 == 3){//TRANSFERENCIA
            System.out.print("Digite o numero da conta para qual deseja transferir: ");
            numContaTranfere = l1.nextInt();
            
            while((numerosContasCorr.contains(numContaTranfere) == false)){
                System.out.println("ERRO, numero da conta não localizado, tente novamente!");
                System.out.println();
                System.out.print("Para realizar o deposito, digite o numero da conta para qual deseja tranferir: ");
                numContaTranfere = l1.nextInt();
              }
              System.out.print("Digite a quantia que deseja tranferir: R$");
              val2 = l1.nextDouble();
              indiceCon = numerosContasCorr.indexOf(numContaTranfere);
              contaCo.transferencia(contasCorr.get(indiceCon),val2);

          }
          else if(opt2 == 4){//EXIBIR O SALDO DA CONTA
            contaCo.mostrarSaldo();
          }
          else if(opt2==5){
            break;
          }
        }else {
          System.out.println("As Operações disponiveis são: \n1 - Saque \n2 - Deposito \n3 - Checar saldo \n4 - Sair do sistema");
          opt2 = l1.nextInt();
          if(opt2 == 1){//SAQUE
            System.out.print("Digite a quantia que deseja sacar: R$");
            val1 = l1.nextInt();
            contaCo.saque(val1);
          }
          else if(opt2 == 2){//DEPOSITO
            System.out.print("Digite a quantia que depositar: R$");
            val1 = l1.nextInt();
            contaCo.deposito(val1);
          }
          else if(opt2 == 3){//EXIBIR O SALDO DA CONTA
            contaCo.mostrarSaldo();
          }
          else if(opt2==4){
            break;
          }
        }
          
  
        }else if(opt3 == 2){
          System.out.print("Para acessar sua conta, digite o cpf cadastrado na mesma: ");
          cpfLog = l1.nextLine();
          while(cpfs.contains(cpfLog) == false){
            System.out.println("ERRO, cpf não reconhecido, tente novamente!");
            System.out.println();
            System.out.print("Para acessar sua conta, digite o cpf cadastrado na mesma: ");
            cpfLog = l1.nextLine();
            
          }indice =cpfs.indexOf(cpfLog);
          ContaPoupanca contaPo = new ContaPoupanca(1, 1, 10.0, null, null, null);
          contaPo = contasPoup.get(indice);
          System.out.println("Bem vindo de volta!"+ contaPo.getCliente().getNome());
          System.out.println();
          if(contasPoup.size()>1)
          {
          System.out.println("As Operações disponiveis são: \n1 - Saque \n2 - Deposito \n3 - Tranferência \n4 - Checar saldo \n5 - Sair do sistema");
          opt2 = l1.nextInt();
          if(opt2 == 1){//SAQUE
            System.out.print("Digite a quantia que deseja sacar: R$");
            val1 = l1.nextInt();
            contaPo.saque(val1);
          }
          else if(opt2 == 2){//DEPOSITO
            System.out.print("Digite a quantia que depositar: R$");
            val1 = l1.nextInt();
            contaPo.deposito(val1);
          }
          else if(opt2 == 3){//TRANSFERENCIA
            System.out.print("Digite o numero da conta para qual deseja transferir: ");
            numContaTranfere = l1.nextInt();
            
            while((numerosContasPoup.contains(numContaTranfere) == false)){
                System.out.println("ERRO, numero da conta não localizado, tente novamente!");
                System.out.println();
                System.out.print("Para realizar o deposito, digite o numero da conta para qual deseja tranferir: ");
                numContaTranfere = l1.nextInt();
              }
              System.out.print("Digite a quantia que deseja tranferir: R$");
              val2 = l1.nextDouble();
              indiceCon = numerosContasPoup.indexOf(numContaTranfere);
              contaPo.transferencia(contasPoup.get(indiceCon),val2);

          }
          else if(opt2 == 4){//EXIBIR O SALDO DA CONTA
            contaPo.mostrarSaldo();
          }
          else if(opt2==5){
            break;
          }
        }else {
          System.out.println("As Operações disponiveis são: \n1 - Saque \n2 - Deposito \n3 - Checar saldo \n4 - Sair do sistema");
          opt2 = l1.nextInt();
          if(opt2 == 1){//SAQUE
            System.out.print("Digite a quantia que deseja sacar: R$");
            val1 = l1.nextInt();
            contaPo.saque(val1);
          }
          else if(opt2 == 2){//DEPOSITO
            System.out.print("Digite a quantia que depositar: R$");
            val1 = l1.nextInt();
            contaPo.deposito(val1);
          }
          else if(opt2 == 3){//EXIBIR O SALDO DA CONTA
            contaPo.mostrarSaldo();
          }
          else if(opt2==4){
            break;
          }
        }
        }

      }
      
      
      break;
    }l1.close();
    break;
  }l1.close();}
}
}

    
  
