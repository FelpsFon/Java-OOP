package Atv1;
// Felipe Louzada Guedes Carneiro da Fontoura - 2112130011

/*
(5 pontos) Escreva uma classe Calculadora que deve possuir como estado um atributo resultado
inicializado com zero na construção de seus objetos. Esta calculadora deverá realizar as
seguintes ações:
a) Somar: que recebe um valor como parâmetro e adiciona esse valor ao atributo resultado.
b) Subtrair: que recebe um valor como parâmetro e decrementa esse valor do atributo
resultado.
c) Multiplicar: que recebe um valor como parâmetro e multiplica o atributo resultado por
esse valor.
d) Dividir: que recebe um valor como parâmetro e divide o atributo resultado por esse valor.
  i. Não será possível realizar divisão por zero.
e) Zerar: que zera o atributo resultado.
f) Exibir: que imprime na tela o valor do resultado.
*/

public class Calculadora {
  // Estados
  double resultado, x;

  // Construtor
  public Calculadora(double resultado) {
    this.resultado = resultado;
  }

  // Métodos
  public void Somar(double x) {
    resultado = resultado + x;
  }

  public void Subtrair(double x) {
    resultado = resultado - x;
  }

  public void Multiplicar(double x) {
    resultado = resultado * x;
  }

  public void Dividir(double x) {
    if (x == 0) { System.out.println("Não é possível realizar divisões por 0."); return; }
    else resultado = resultado / x;
  }

  public void Zerar() {
    resultado = 0;
    System.out.println("Resultado zerado!");
  }

  public void Exibir() {
    System.out.println("O resultado atual é: " + resultado);
  }

  public static void main(String[] args) {
    Calculadora resultado = new Calculadora(0);
    
    resultado.Zerar();
    resultado.Exibir();

    resultado.Somar(5);
    resultado.Exibir();
    
    resultado.Subtrair(9);
    resultado.Exibir();
    
    resultado.Multiplicar(95);
    resultado.Exibir();
    
    resultado.Dividir(250);
    resultado.Exibir();

    resultado.Dividir(0);
    resultado.Exibir();
    
    resultado.Zerar();
    resultado.Exibir();
  }
}