package Polimorfismo;

public class Medico extends Empregado {
  private String crm;

  public String getCrm() {
    return crm;
  }

  public void setCrm(String novoCrm) {
    this.crm = novoCrm;
  }

  @Override //Sobrescrita - aplicação de Polimorfismo - Quando a implementação do método é modificada
  public void setNome(String novoNome) {
    this.nome = "Dr(a). " + novoNome;
  }

  //Sobrecarga - NÃO é Polimorfismo - Quando o mesmo método tem diferentes implementações
  public void setNome(String sufixo, String novoNome) {
    this.nome = sufixo + " " + novoNome;
  }

  public void prescreverReceita(String paciente) {
    System.out.println("Aqui implementa a prescrição de receita ao paciente: " + paciente);
  }

  //Sobrecarga - NÃO é Polimorfismo - Quando o mesmo método tem diferentes implementações
  public void prescreverReceita(String paciente, String[] medicamentos) {
    System.out.println("Aqui implementa a prescrição dos medicamentos (" + medicamentos + ") ao paciente: " + paciente);
  }

  @Override
  public String toString() {
    return "nome: " + this.nome + "\n"
          + "Data de Nascimento: " + this.dataNasc + "\n"
          + "CRM: " + this.crm;
  }
}