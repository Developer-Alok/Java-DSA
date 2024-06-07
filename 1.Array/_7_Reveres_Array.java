public class _7_Reveres_Array {

  public static int reveres(int numbers[]) {
    int start = 0, end = numbers.length - 1;
    while (start < end) {

      int temp = numbers[end];
      numbers[end] = numbers[start];
      numbers[start] = temp;

      start = start + 1;
      end = end - 1;

    }
    return 1;

  }

  public static void main(String[] args) {
    int numbers[] = { 2, 4, 6, 8, 10, 12 };
    reveres(numbers);
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i]+" ");

    }
  }

}
