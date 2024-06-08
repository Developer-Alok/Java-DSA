public class _8_Pairs_Array {

  public static void pairs(int numbers[]) {
    for (int i = 0; i < numbers.length; i++) {
      int firstValue = numbers[i];
      for (int j = i + 1; j < numbers.length; j++) {
        System.out.print("(" + firstValue + "," + numbers[j] + ")");
        }
      System.out.println();

    }

  }

  public static void main(String[] args) {
    int numbers[] = { 2, 4, 5, 6, 7, 8 };
    pairs(numbers);
  }

}
