package SimuladoP1;

public class Animal {
  private String nome, raca;

  public Animal(String nome, String raca) {
    this.nome = nome;
    this.raca = raca;
  }

  String caminha() {
    String passos;
    double x = 0;

    passos = ("O animal deu" + (x + 1) + "passos.\n");
    return passos;
  }
}