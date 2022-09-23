package Polimorfismo;

public class Main {
  public static void main(String[] args) {
    // Empregado empregado = new Empregado(); - Classe foi abstraída, não pode mais ser instanciada como objeto.
    Medico medico = new Medico();

    System.out.print(medico);
  }
}