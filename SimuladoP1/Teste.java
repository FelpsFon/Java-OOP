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
            System.out.println(usr.valor + usr.unidade + "convertido em cm³ é igual a: " + usr.litroCm3(usr.valor) + "cm³");
          else
            System.out.println("Apenas litros podem ser convertidos em cm³!");
          break;
        case "litro":
          if(usr.unidade == "cm3")
            System.out.println(usr.valor + usr.unidade + "convertido em litro(s) é igual a: " + usr.cm3Litro(usr.valor) + " litro(s)");
          else if(usr.unidade == "galAm")
            System.out.println(usr.valor + usr.unidade + "convertido em litro(s) é igual a: " + usr.galAmLitro(usr.valor) + " litro(s)");
          else if(usr.unidade == "m3")
            System.out.println(usr.valor + usr.unidade + "convertido em litro(s) é igual a: " + usr.m3L(usr.valor) + " litro(s)");
          else
            System.out.println("Litros só podem ser convertidos em cm³, m³ e Galões Americanos!");
          break;
        case "m3":
          if(usr.unidade == "litro")
            System.out.println(usr.valor + usr.unidade + "convertido em m³ é igual a: " + usr.litroM3(usr.valor) + "m³");
          else if(usr.unidade == "p3")
            System.out.println(usr.valor + usr.unidade + "convertido em m³ é igual a: " + usr.p3m3(usr.valor) + "m³");
          else
            System.out.println("Apenas litros e pés³ podem ser convertidos em m³!");
          break;
        case "p3":
          if(usr.unidade == "m3")
            System.out.println(usr.valor + usr.unidade + "convertido em pé(s)³ é igual a: " + usr.m3p3(usr.valor) + " pé(s)³");
          else
            System.out.println("Apenas m³ podem ser convertidos em pé(s)³!");
          break;
        case "galAm":
          if(usr.unidade == "litro")
            System.out.println(usr.valor + usr.unidade + "convertido em galAm é igual a: " + usr.litroGalAm(usr.valor) + " galAm");
          else if(usr.unidade == "pol3")
            System.out.println(usr.valor + usr.unidade + "convertido em galAm é igual a: " + usr.pol3GalAm(usr.valor) + " galAm");
          else
            System.out.println("Apenas litros e polegadas³ podem ser convertidos em Galões Americanos!");
          break;
        case "pol3":
          if(usr.unidade == "galAm")
            System.out.println(usr.valor + usr.unidade + "convertido em polegadas³ é igual a: " + usr.m3p3(usr.valor) + " polegadas³");
          else
            System.out.println("Apenas Galões Americanos podem ser convertidos em polegadas³!");
          break;
        default:
          System.out.println("Unidade inválida!");
          break;
      }
    }
  }
}