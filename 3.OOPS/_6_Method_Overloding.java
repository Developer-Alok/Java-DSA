class calculator {
  int sum(int a, int b) {
    return a + b;
  }

  float sum(float a, float b) {
    return a + b;
  }

  int sum(int a, int b, int c) {
    return a + b + c;
  }

}

public class _6_Method_Overloding {

  public static void main(String[] args) {
    calculator calc = new calculator();
    System.out.println(calc.sum(2, 3));
    System.out.println(calc.sum((float) 2.4, (float) 3.9));
    System.out.println(calc.sum(2, 3, 7));

  }

}
