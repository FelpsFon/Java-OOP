import java.util.Scanner;

public class Banco {
  //Armazena nome, CPF e saldo do cliente
  String nome, cpf;
  double saldo;

  Scanner scan = new Scanner(System.in);

  public Banco(String nome, String cpf, double saldo) {
    this.nome = nome;
    this.cpf = cpf;
    this.saldo = 0;
  }

  //Realizar operações de saque, depósito e exibição de saldo
  //Não podem ser feitos saques em contas sem saldo
  public void sacar(double saque) {

    if (saque <= saldo) {
      saldo = saldo - saque;
      System.out.printf("Saque de R$%.2f realizado.\n", saque);
    } else {
      System.out.println("Sua conta não tem saldo suficiente para essa transação.");
    }
  }

  public void depositar(double deposito) {

    saldo = saldo + deposito;
    System.out.printf("Deposito de R$%.2f realizado.\n", deposito);
  }

  public void exibirSaldo() {

    System.out.printf("O saldo atual da sua conta é: R$%.2f\n", saldo);
  }

  public static void limpaTela() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
  
  public void menu(Banco cliente) {
    int opcao;

    while(true) {
      System.out.println("1. Sacar");
      System.out.println("2. Depositar");
      System.out.println("3. Exibir saldo");
      System.out.println("4. Sair");

      opcao = scan.nextInt();

      switch(opcao) {
        case 1:
          limpaTela();
          System.out.println("Digite a quantia a ser sacada: R$");
          cliente.sacar(scan.nextDouble());
          break;
          case 2:
          limpaTela();
          System.out.println("Digite a quantia a ser depositada: R$");
          cliente.depositar(scan.nextDouble());
          break;
          case 3:
          limpaTela();
          cliente.exibirSaldo();
          break;
        case 4:
          limpaTela();
          System.out.print("Até logo!");
          return;
      }
    }
  }

  public static void main(String[] args) {
    Banco felipe = new Banco("Felipe", "015.259.571-63", 347.05);

    felipe.menu(felipe);
  }
}

//Felipe Louzada Guedes Carneiro da Fontoura - 2112130011