package SimuladoP1;

public class Gato extends Animal {

  public Gato(String nome, String raca) {
    super(nome, raca);
  }
  
  String mia() {
    String miado = "miau miau\n";
    return miado;
  }
}