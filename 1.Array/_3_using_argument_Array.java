public class _3_using_argument_Array {

  public static void update(int mark[], int doNotChangeNumber) {
    doNotChangeNumber = 11;

    for (int i = 0; i < mark.length; i++) {
      mark[i] = mark[i] + 1;

    }

  }

  public static void main(String[] args) {
    int mark[] = { 39, 59, 69 };
    int doNotChangeNumber = 5;

    update(mark, doNotChangeNumber);

    System.out.println("doNotChangeNumber:" + doNotChangeNumber);
    for (int i = 0; i < mark.length; i++) {
      System.out.print(mark[i] + " ");

    }

  }
}
// array always call by reference
