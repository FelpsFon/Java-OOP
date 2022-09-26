package SimuladoP1;
import java.util.Scanner;

// Depois crie uma classe Teste para realizar a chamada dos métodos criados.

public class Teste extends ConversaoDeUnidadesDeVolume {
  //Atributos
  String unidade;
  double valor;
  static Scanner scan = new Scanner(System.in);

  //Construtor
  public Teste(String unidade, double valor) {
    this.unidade = unidade;
    this.valor = valor;
  }

  //Métodos
  void consultarUsuario() {
    System.out.println("--- Insira abaixo uma unidade de volume e seu valor ---");
    System.out.print("Valor: "); valor = scan.nextDouble();
    System.out.print("Unidade (cm3, litro, m3, pe3, galAm, pol3): "); unidade = scan.nextLine();

    System.out.printf("Valor a ser convertido: %.f%s\n", valor, unidade);
  }

  public static void main(String[] args) {
    Teste usr = new Teste("", 0);
    
    while(true) {
      String unidadeObjetivo;
      usr.consultarUsuario();

      System.out.print("Para qual unidade você deseja converter?\n(cm3, litro, m3, pe3, galAm, pol3): "); unidadeObjetivo = scan.nextLine();
      
      switch(unidadeObjetivo) {
        case "cm3":
          if(usr.unidade == "litro")
            System.out.println(usr.valor + usr.unidade + "convertido em litro(s) é igual a: " + usr.cm3Litro(usr.valor) + "L");
          else
            System.out.println("cm³ só podem ser convertidos em litros!");
          break;
        case "litro":
          if(usr.unidade == "cm3")
            System.out.println(usr.valor + usr.unidade + "convertido em litro(s) é igual a: " + usr.litroCm3(usr.valor) + "cm³");
          else if(usr.unidade == "galAm")
            usr.litroGalAm(usr.valor);
          else if(usr.unidade == "m3")
            usr.litroM3(usr.valor);
          else
            System.out.println("Litros só podem ser convertidos em cm³, m³ e Galões Americanos!");
          break;
        case "m3":
          break;
        case "pe3":
          break;
        case "galAm":
          break;
        case "pol3":
          break;
        default:
          System.out.println("Unidade inválida!");
          break;
      }
    }
  }
}