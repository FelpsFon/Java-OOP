package Polimorfismo;

public class Main {
  public static void main(String[] args) {
    // Empregado empregado = new Empregado(); - Classe foi abstraída, não pode mais ser instanciada como objeto.
    Medico medico = new Medico();

    System.out.print(medico);

    Carro fusca = new Carro(0);
		fusca.acelera();
		fusca.acelera();
		fusca.acelera();
		
		System.out.println(fusca.getVelocidade());

		Carro outroFusca = new CarroInteligente(50);
		/*for(int i = outroFusca.getVelocidade(); i > 0; i--;) {
			outroFusca.freia();
		}*/
		while(outroFusca.getVelocidade() > 0) {
			if (outroFusca.getVelocidade() % 5 == 0) System.out.println(outroFusca.getVelocidade());
			outroFusca.freia();
		}
  }
}