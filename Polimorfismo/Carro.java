public class Carro {
	private int velocidade;

	public Carro (int velocidadeInicial) {
		velocidade = velocidadeInicial;
	}

	public void acelera() {
		velocidade++;
	}

	public void freia() {
		velocidade--;
	}

	public int getVelocidade() {
		return velocidade;
	}
}