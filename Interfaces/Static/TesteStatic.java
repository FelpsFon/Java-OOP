public class TesteStatic {
  public static void main(String[] args) {
    System.out.println("i: " + ClasseStatic.i);
    ClasseStatic.incrementaI();
    //ClasseStatic.j;
    //ClasseStatic.incrementaJ();

    ClasseStatic cs1 = new ClasseStatic();
      System.out.println("cs1.j: " + cs1.j);
      System.out.println("cs1.i: " + cs1.i);
    ClasseStatic cs2 = new ClasseStatic();
      System.out.println("cs2.j: " + cs2.j);
      System.out.println("cs2.i: " + cs2.i);
  }
}