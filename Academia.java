// Felipe Louzada Guedes Carneiro da Fontoura - 2112130011

/*
(5 pontos) Em uma academia de crossfit existem alunos com idade de no mínimo 18 anos. Nesta
academia, os dados dos alunos são o: nome, sobrenome, idade, altura e peso. Cada aluno pode
realizar as seguintes ações:
a) Comer, podendo ser as seguintes refeições (passadas como parâmetro):
  i. Frutas: aumenta em 50g o peso.
  ii. Lanche: aumenta em 100 gramas o peso.
  iii. Almoço ou jantar: aumenta em 200 gramas o peso.
b) Treinar, com as seguintes modalidades (passadas como parâmetro):
  i. Intenso: decrementa em 150 gramas o peso.
  ii. Moderado: decrementa em 100 gramas o peso.
  iii. Leve: decrementa em 50 gramas o peso.
*/

public class Academia {
  // Estados
  int idade;
  String nome, aimc;
  double peso, altura, imc;

  // Construtor
  public Academia(String nome, int idade, double peso, double altura) {
    this.nome = nome;
    this.idade = idade;
    this.peso = peso;
    this.altura = altura;
  }

  // Métodos
  public void Comer(int opcao) {
    switch (opcao) {
      case 1:
        peso = peso + 0.05;
        break;
      case 2:
        peso = peso + 0.1;
        break;
      case 3:
        peso = peso + 0.2;
        break;
      default:
        System.out.println("Opção inválida!");
    }
  }

  public void Treinar(int opcao) {
    switch (opcao) {
      case 1:
        peso = peso - 0.15;
        break;
      case 2:
        peso = peso - 0.1;
        break;
      case 3:
        peso = peso - 0.05;
        break;
      default:
        System.out.println("Opção inválida!");
    }
  }

  public double CalcularIMC() {
    imc = (peso / (altura * altura));
    return imc;
  }

  public String AvaliarIMC(double imc) {
    if (imc < 16) aimc = "Baixo peso Grau III";
    else if (imc >= 16 && imc <= 16.99) aimc = "Baixo peso Grau II";
    else if (imc >= 17 && imc <= 18.49) aimc = "Baixo peso Grau I";
    else if (imc >= 18.50 && imc <= 24.99) aimc = "Peso ideal";
    else if (imc >= 25.00 && imc <= 29.99) aimc = "Sobrepeso";
    else if (imc >= 30.00 && imc <= 34.99) aimc = "Obesidade Grau I";
    else if (imc >= 35.00 && imc <= 39.99) aimc = "Obesidade Grau II";
    else if (imc >= 40.0) aimc = "Obesidade Grau III";
    return aimc;
  }

  public void ExibirFicha() {
    System.out.printf("--- %s ---\nIdade: %d\nPeso: %.2f\nAltura: %.2f\n", nome, idade, peso, altura);
  }

  public static void main(String[] args) {
    Academia aluno1 = new Academia("Felipe Louzada", 19, 55.6, 1.61);

    /*  1. Frutas
        2. Lanche
        3. Almoço/Jantar */
    aluno1.Comer(1);
    aluno1.Comer(2);
    aluno1.Comer(3);

    /*  1. Intenso
        2. Moderado
        3. Leve */
    aluno1.Treinar(1);
    aluno1.Treinar(2);
    aluno1.Treinar(3);

    System.out.printf("O IMC atual de %s é: %.2f\n", aluno1.nome, aluno1.CalcularIMC());
    System.out.printf("O IMC de %s se encaixa na categoria: %s\n", aluno1.nome, aluno1.AvaliarIMC(aluno1.CalcularIMC()) );

    aluno1.ExibirFicha();
  }
}