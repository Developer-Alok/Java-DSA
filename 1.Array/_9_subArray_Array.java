public class _9_subArray_Array {

  public static void subArray(int elements[]) {
    int ts = 0;
    for (int i = 0; i < elements.length; i++) {
      int start = i;
      for (int j = 0; j < elements.length; j++) {
        int end = j;
        for (int k = start; k <= end; k++) {
          System.out.print(elements[k] + ",");

        }
        ts++;
        System.out.println();
      }
      System.out.println();
    }
    System.out.println("total sub array:" + ts);
  }

  public static void main(String[] args) {
    int elements[] = { 2, 4, 6, 8, 10 };

    subArray(elements);
  }

}
