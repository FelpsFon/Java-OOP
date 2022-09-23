import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class teste {
  String operacao;
  Scanner scan = new Scanner(System.in);

  public teste(String operacao) {
    this.operacao = operacao;
  }

  public void inserirOperacao() {
    System.out.print("Insira uma operação: ");
    operacao = scan.nextLine();
  }

  public void exibirOperacao() {
    System.out.println(operacao);
  }

  List operacaoElementos = new ArrayList<>();

  public static void main(String[] args) {
    teste executar = new teste("");

    executar.inserirOperacao();
    executar.exibirOperacao();
  }
}