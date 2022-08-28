public class Pessoa {
  String nome;
  int idade;
  String genero;

  double posX;
  double posY;

  //construtor da classe Pessoa
  public Pessoa(String nome, int idade, String genero) {
    this.nome = nome;
    this.genero = genero;
    this.idade = idade;
  
    posX = 0;
    posY = 0;
  }

  //métodos (comportamentos)
  public void andar(double x, double y) {
    posX = x;
    posY = y;
  }

  public void falar(String fala) {
    System.out.println(fala);
  }

  public static void main(String[] args) {
    Pessoa felipe = new Pessoa("Felipe", 19, "Masculino");

    felipe.falar("Hello World!");
    felipe.falar("Olá Mundo!");
  }
}