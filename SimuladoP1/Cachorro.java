package SimuladoP1;

public class Cachorro extends Animal {

  public Cachorro(String nome, String raca) {
    super(nome, raca);
  }
  
  String late() {
    String latido = "au au\n";
    return latido;
  }
}