import java.util.Scanner;

public class _5_largestNumber_Array {

  public static int largestNumber(int numbers[]) {
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < numbers.length; i++) {
      if (largest < numbers[i]) {
        largest = numbers[i];
      }

    }
    return largest;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size array:");
    int size = sc.nextInt();

    int numbers[] = new int[size];
    System.out.print("Enter the array element:");
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = sc.nextInt();
    }
    System.out.print("the array is:");
    for (int j = 0; j < numbers.length; j++) {

      System.out.print(numbers[j] + " ");
    }
    System.out.println();
    int number=largestNumber(numbers);
    System.out.println(number);
  }

}
