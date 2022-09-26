package SimuladoP1;

// • 1 litro = 1000 centímetros cúbicos 
// • 1 metro cúbico = 1000 litros 
// • 1 metro cúbico = 35.32 pés cúbicos 
// • 1 galão americano = 231 polegadas cúbicas 
// • 1 galão americano = 3.785 litros 
// Cada conversão deve ser realizada por um método que recebe como parâmetro um valor para converter. 

public abstract class ConversaoDeUnidadesDeVolume {
  //Abtributos
  protected double cm3, litro, m3, p3, galAm, pol3;

  //Métodos
  double litroCm3(double litro) {
    return cm3 = litro * 1000;
  }

  double cm3Litro(double cm3) {
    return litro = cm3 / 1000;
  }

  double m3L(double m3) {
    return litro = m3 * 1000;
  }

  double litroM3(double litro) {
    return m3 = litro / 1000;
  }
  
  double m3p3(double m3) {
    return p3 = m3 * 35.32;
  }

  double p3m3(double p3) {
    return m3 = p3 / 35.32;
  }

  double galAmPol3(double galAm) {
    return pol3 = galAm * 231;
  }

  double pol3GalAm(double pol3) {
    return galAm = pol3 / 231;
  }

  double galAmLitro(double galAm) {
    return litro = galAm * 3.785;
  }

  double litroGalAm(double litro) {
    return galAm = litro / 3.785;
  }
}